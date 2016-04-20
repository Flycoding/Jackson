package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class User2 {
    private int id;
    private Name name;

    public User2() {
    }

    public User2(final int id, final Name name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(final Name name) {
        this.name = name;
    }

    @JsonIgnoreType
    public static class Name {
        private String firstName;
        private String lastName;

        public Name() {
        }

        public Name(final String firstName, final String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
