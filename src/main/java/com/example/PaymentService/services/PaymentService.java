package com.example.PaymentService.services;

import com.example.PaymentService.dtos.InitiatePaymentDto;
import com.example.PaymentService.paymentgateways.IPaymentGateway;
import com.example.PaymentService.paymentgateways.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;
    public String InitiatePayment(Long amount, String orderId, String phoneNumber,
                                  String name, String email)
    {
        IPaymentGateway paymentGateway = paymentGatewayChooserStrategy.getPaymentGateway();
        return paymentGateway.generatePaymentLink(amount, orderId, phoneNumber,
                name, email);
    }
}
