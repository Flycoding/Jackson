package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by Flyingh on 2016/4/20.
 */
@JsonPropertyOrder({"name", "n", "id"})
public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonGetter("name")
    public String getMyName() {
        return name;
    }
}
