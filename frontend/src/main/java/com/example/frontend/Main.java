package com.example.frontend;

import java.util.Scanner;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esecuzione del frontend OpenBCI Integration");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci l'importo del pagamento: ");
        String amount = scanner.nextLine();

        try {
            URL url = new URL("http://localhost:8080/api/payment"); // Endpoint del backend
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            String jsonInputString = "{\"amount\": \"" + amount + "\"}";

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int code = conn.getResponseCode();
            System.out.println("Response code: " + code);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
