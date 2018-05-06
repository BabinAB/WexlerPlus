package ru.levelp.myapp.model;

import javax.persistence.*;

@Entity
public class Part {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "part_id", unique = true, nullable = false)
    private String partId;

    @Column
    private String title;

    @ManyToOne
    private Supplier supplier;

    public Part() {
    }

    public Part(String partId, String title) {
        this.partId = partId;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
