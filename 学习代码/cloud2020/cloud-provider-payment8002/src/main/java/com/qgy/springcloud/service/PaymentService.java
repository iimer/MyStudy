package com.qgy.springcloud.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qgy.springcloud.entities.Payment;

/**
 * @author qgyiimer
 * @create 2021-{07}--16:11
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentByID(Long id);
}
