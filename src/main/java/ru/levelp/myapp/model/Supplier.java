package ru.levelp.myapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Supplier {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @OneToMany
    private List<Part> parts;

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

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }
}
