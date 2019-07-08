package com.enjoy.springevent.service;

import com.enjoy.springevent.entity.Order;

public interface EmailService {

    void sendEmail(Order order);

    void handlerOrderEvent(Order order);

}
