package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Created by Flyingh on 2016/4/20.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class OrderItem2 {
    private int id;
    private String name;
    private Order2 order;

    public OrderItem2() {
    }

    public OrderItem2(int id, String name, Order2 order) {
        this.id = id;
        this.name = name;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order2 getOrder() {
        return order;
    }

    public void setOrder(Order2 order) {
        this.order = order;
    }
}
