package com.enjoy.springevent.entity;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Order {
    private Integer id;
    private String  userId;
    private String userName;
    private Date createDate;

    public Order(Integer id, String userId, String userName, Date createDate) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.createDate = createDate;
    }
}
