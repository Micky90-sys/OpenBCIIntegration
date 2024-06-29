package com.example.springpaymentgateway.controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class PaymentController {

    private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @PostMapping("/payment")
    public String processPayment(@RequestBody PaymentRequest request) {
        logger.info("Ricevuto pagamento di importo: " + request.getAmount());
        return "Pagamento elaborato con successo";
    }
}
