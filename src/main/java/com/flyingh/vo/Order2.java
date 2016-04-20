package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;

/**
 * Created by Flyingh on 2016/4/20.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Order2 {
    private int id;
    private List<OrderItem2> items;

    public Order2() {
    }

    public Order2(final int id, final List<OrderItem2> items) {
        this.id = id;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public List<OrderItem2> getItems() {
        return items;
    }

    public void setItems(final List<OrderItem2> items) {
        this.items = items;
    }
}
