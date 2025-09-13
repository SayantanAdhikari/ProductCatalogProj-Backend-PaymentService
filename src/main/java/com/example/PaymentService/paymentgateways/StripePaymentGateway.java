package com.example.PaymentService.paymentgateways;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentGateway implements IPaymentGateway {
    @Override
    public String generatePaymentLink(Long amount, String orderId, String phoneNumber,
                                      String name, String email) {
        return "Will be added later";
    }
}
