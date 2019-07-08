package com.enjoy.springevent.service.impl;

import com.enjoy.springevent.entity.Order;
import com.enjoy.springevent.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private ApplicationContext context;

    @Override
    public void addOrder(Order order) {
        this.context.publishEvent(order);
        log.info("addOrder,order{}," + order.getId());

    }
}
