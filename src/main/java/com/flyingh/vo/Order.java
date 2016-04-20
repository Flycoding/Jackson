package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class Order {
    private int id;
    @JsonBackReference
    private List<OrderItem> items;

    public Order() {
    }

    public Order(final int id, final List<OrderItem> items) {
        this.id = id;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(final List<OrderItem> items) {
        this.items = items;
    }
}
