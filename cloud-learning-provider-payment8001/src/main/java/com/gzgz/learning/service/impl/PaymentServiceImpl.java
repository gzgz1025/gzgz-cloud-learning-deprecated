package com.gzgz.learning.service.impl;

import com.gzgz.learning.mapper.PaymentMapper;
import com.gzgz.learning.model.Payment;
import com.gzgz.learning.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

import javax.annotation.Resource;

/**
 * @author Yang Hao
 * @description
 * @date 2020-09-14 16:07
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public int create(Payment payment) {
        paymentMapper.insert(payment);
        return 0;
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = paymentMapper.selectOneByExample(new Example.Builder(Payment.class).where(WeekendSqls.<Payment>custom().andEqualTo(Payment::getId, id)).build());
        return payment;
    }
}
