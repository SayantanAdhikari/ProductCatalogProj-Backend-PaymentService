package com.example.PaymentService.controllers;

import com.example.PaymentService.dtos.InitiatePaymentDto;
import com.example.PaymentService.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDto initiatePaymentDto)
    {
        return paymentService.InitiatePayment(initiatePaymentDto.getAmount(),
                initiatePaymentDto.getOrderId(),
                initiatePaymentDto.getPhoneNumber(),
                initiatePaymentDto.getName(),
                initiatePaymentDto.getEmail());
    }
}
