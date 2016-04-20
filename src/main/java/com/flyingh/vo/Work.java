package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class Work {
    @JacksonInject
    private int id;
    private String name;

    @JsonCreator
    public Work(@JsonProperty("id") final int id, @JsonProperty("my_name") final String name) {
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
