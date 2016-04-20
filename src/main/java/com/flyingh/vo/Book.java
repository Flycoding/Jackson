package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by Flyingh on 2016/4/20.
 */
@JsonRootName("my_book")
public class Book {
    private int id;
    private String name;

    public Book(final int id, final String name) {
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
