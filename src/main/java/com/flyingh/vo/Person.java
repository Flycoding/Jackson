package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class Person {
    private int id;
    private Map<String, String> map = Maps.newHashMap();

    public Person() {
    }

    public Person(int id, Map<String, String> map) {
        this.id = id;
        this.map = map;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonAnyGetter
    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @JsonAnySetter
    public void put(String key, String value) {
        map.put(key, value);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", map=" + map +
                '}';
    }
}
