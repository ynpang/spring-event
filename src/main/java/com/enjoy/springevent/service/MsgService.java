package com.enjoy.springevent.service;

import com.enjoy.springevent.entity.Order;

public interface MsgService {

    void sendMsg(Order order);

    void handlerOrderEvent(Order order);
}
