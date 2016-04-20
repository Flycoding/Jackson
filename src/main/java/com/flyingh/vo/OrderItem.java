package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class OrderItem {
    private int id;
    private String name;
    @JsonManagedReference
    private Order order;

    public OrderItem() {
    }

    public OrderItem(int id, String name, Order order) {
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
