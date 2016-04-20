package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by Flyingh on 2016/4/20.
 */
public enum Gender {
    MALE(0, "male"), FEMALE(1, "female");
    private final int id;
    private final String desc;

    Gender(final int id, final String desc) {
        this.id = id;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    @JsonValue
    public String getDesc() {
        return desc;
    }
}
