package com.example.TelecomPaymentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TelecomPaymentModel.PaymentModel;


public interface PaymentRepository extends JpaRepository<PaymentModel, Long> {
}
