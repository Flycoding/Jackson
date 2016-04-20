package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class Person3 {
    @JsonIgnore
    private int id;
    private String name;

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
}
