package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class Worker2 {
    @JsonView(View.Public.class)
    private int id;
    @JsonView(View.Public.class)
    private String name;
    @JsonView(View.Private.class)
    private double salary;

    public Worker2() {
    }

    public Worker2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static class View {
        public static class Public {
        }

        public static class Private extends Public {
        }
    }
}
