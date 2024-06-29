package com.example.springpaymentgateway.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public boolean processPayment(double amount) {
        // Logica per processare il pagamento
        System.out.println("Processing payment of amount: " + amount);
        // Supponiamo che il pagamento venga sempre completato con successo
        return true;
    }
}
