package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * Created by Flyingh on 2016/4/20.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class User4 {
    private int id;
    private String name;

    public User4() {
    }

    public User4(final int id, final String name) {
        this.id = id;
        this.name = name;
    }
}
