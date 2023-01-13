//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mjc.school.repository.model;

import java.util.Objects;

public class AuthorModel {
    private Long id;
    private String name;

    public AuthorModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof AuthorModel)) {
            return false;
        } else {
            AuthorModel that = (AuthorModel)o;
            return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name});
    }
}
