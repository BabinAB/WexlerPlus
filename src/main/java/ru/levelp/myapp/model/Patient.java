package ru.levelp.myapp.model;

import javax.persistence.*;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "patient_id", unique = true, nullable = false)
    private String patientId;

    @Column
    private String fullName;

    @ManyToOne
    private IntelligenceQuotient intelligenceQuotient;

    public Patient() {
    }

    public Patient(String patientId, String fullName) {
        this.patientId = patientId;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String partId) {
        this.patientId = partId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String title) {
        this.fullName = title;
    }

    public IntelligenceQuotient getIntelligenceQuotient() {
        return intelligenceQuotient;
    }

    public void setIntelligenceQuotient(IntelligenceQuotient intelligenceQuotient) {
        this.intelligenceQuotient = intelligenceQuotient;
    }
}
