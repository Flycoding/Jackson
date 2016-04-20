package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonRawValue;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class Student {
    private int id;
    @JsonRawValue
    private String json;

    public Student(int id, String json) {
        this.id = id;
        this.json = json;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
