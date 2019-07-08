package com.enjoy.springevent;

import com.enjoy.springevent.entity.Order;
import com.enjoy.springevent.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderEventTest {

    @Resource
    private OrderService orderService;

    @Test
    //@Transactional
    public void testOrder() throws InterruptedException {
        Order order = new Order(1,"u00001","seven",new Date());
        orderService.addOrder(order);
        Thread.currentThread().sleep(500);
    }
}
