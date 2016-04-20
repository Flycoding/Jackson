package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Flyingh on 2016/4/20.
 */
@JsonIgnoreProperties("id")
public class Person2 {
    private int id;
    private String name;

    public Person2() {
    }

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
