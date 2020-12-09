package com.gzgz.learning.service;


import com.gzgz.learning.model.Payment;

/**
 * @author Yang Hao
 * @description
 * @date 2020-09-14 16:07
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
