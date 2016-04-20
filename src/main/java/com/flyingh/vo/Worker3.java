package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonFilter;

/**
 * Created by Flyingh on 2016/4/20.
 */
@JsonFilter("salaryFilter")
public class Worker3 {
    private int id;
    private String name;
    private double salary;

    public Worker3() {
    }

    public Worker3(int id, String name, double salary) {
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
