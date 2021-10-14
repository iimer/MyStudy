package com.qgy.springcloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qgy.springcloud.dao.PaymentDao;
import com.qgy.springcloud.entities.Payment;
import com.qgy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qgyiimer
 * @create 2021-{07}--16:13
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment getPaymentByID(Long id) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id",id);
        return paymentDao.selectOne(wrapper);
    }
}
