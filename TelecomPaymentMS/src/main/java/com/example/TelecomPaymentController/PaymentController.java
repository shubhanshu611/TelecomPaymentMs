package com.example.TelecomPaymentController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TelecomPaymentModel.PaymentModel;
import com.example.TelecomPaymentRepository.PaymentRepository;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentRepository paymentRepository;

    @PostMapping
    public PaymentModel createPayment(@RequestBody PaymentModel payment) {
        return paymentRepository.save(payment);
    }

    @GetMapping("/{id}")
    public <Payment> Optional<PaymentModel> getPaymentById(@PathVariable("id") Long id) {
        return paymentRepository.findById(id);
              //  .orElseThrow(() -> new ResourceNotFoundException("Payment", "id", id));
    }
}