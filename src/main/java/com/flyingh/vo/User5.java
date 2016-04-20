package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class User5 {
    private int id;
    private String myName;

    public User5() {
    }

    public User5(int id, String myName) {
        this.id = id;
        this.myName = myName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMyName() {
        return myName;
    }

    @JsonProperty("name")
    public void setMyName(String myName) {
        this.myName = myName;
    }
}
