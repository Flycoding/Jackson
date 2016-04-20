package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Created by Flyingh on 2016/4/20.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Zoo {
    private Animal animal;

    public Zoo() {
    }

    public Zoo(Animal animal) {
        this.animal = animal;
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Cat.class, name = "cat")
    })
    public static class Animal {
        private String name;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonTypeName("dog")
    public static class Dog extends Animal {
        private String d;

        public Dog() {
        }

        public Dog(String name, String d) {
            super(name);
            this.d = d;
        }
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonTypeName("cat")
    public static class Cat extends Animal {
        private String c;

        public Cat() {
        }

        public Cat(String name, String c) {
            super(name);
            this.c = c;
        }
    }
}
