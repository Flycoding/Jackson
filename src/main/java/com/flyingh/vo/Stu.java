package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class Stu {
    private int id;
    private String myName;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    @JsonGetter("haha")
    public String getMyName() {
        return myName;
    }

    @JsonSetter("name")
    public void setMyName(final String myName) {
        this.myName = myName;
    }
}
