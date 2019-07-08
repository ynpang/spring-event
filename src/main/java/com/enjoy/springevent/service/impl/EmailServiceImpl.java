package com.enjoy.springevent.service.impl;

import com.enjoy.springevent.entity.Order;
import com.enjoy.springevent.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(Order order) {
        log.info("sendEmail,order {}," + order.getId());

    }

    @Override
    @EventListener
    @Async
    public void handlerOrderEvent(Order order) {
        this.sendEmail(order);
    }
}
