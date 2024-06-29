package com.example.springpaymentgateway.integration;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PaymentClient {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/pay");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            OutputStream os = connection.getOutputStream();
            os.write("".getBytes());
            os.flush();
            os.close();

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                System.out.println("Pagamento avvenuto con successo!");
            } else {
                System.out.println("Errore nel pagamento.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
