package com.microservice.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.paymentservice.entity.Payment;
import com.microservice.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	
	@PostMapping("/doPayment")
	public Payment doPayment(Payment payment) {
		return paymentService.doPayment(payment);
	}
	
	
	
}