package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Flyingh on 2016/4/20.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User3 {
    private int id;
    private String name;

    public User3(int id, String name) {
        this.id = id;
        this.name = name;
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
}
