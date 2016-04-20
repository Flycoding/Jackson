package com.flyingh.vo;

/**
 * Created by Flyingh on 2016/4/20.
 */
@MyAnnotation
public class User7 {
    private int id;
    private int age;
    private String name;

    public User7() {
    }

    public User7(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public User7(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User7(final int id, final int age, final String name) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
