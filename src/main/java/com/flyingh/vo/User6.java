package com.flyingh.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * Created by Flyingh on 2016/4/20.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class User6 {
    private int id;
    @JsonUnwrapped
    private Name name;

    public User6() {
    }

    public User6(int id, Name name) {
        this.id = id;
        this.name = name;
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static class Name {
        private String firstName;
        private String lastName;

        public Name() {
        }

        public Name(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
