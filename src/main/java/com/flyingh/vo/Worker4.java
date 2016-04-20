package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by zhujiankui on 2016/4/20.
 */
public class Worker4 {
    private int id;
    private String name;
    @JsonIgnore
    private double salary;

    public Worker4() {
    }

    public Worker4(int id, String name, double salary) {
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
}
