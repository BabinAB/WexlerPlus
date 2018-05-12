package ru.levelp.myapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class IntelligenceQuotient {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @OneToMany
    private List<Patient> patients;

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

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
