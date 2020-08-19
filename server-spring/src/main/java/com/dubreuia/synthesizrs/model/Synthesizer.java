package com.dubreuia.synthesizrs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "synthesizers")
public class Synthesizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String brand;

    @Column
    private String name;

    @Column
    private String creationYear;

    @Column
    private String filename;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    public Synthesizer() {
    }

    public Synthesizer(String brand, String name, String creationYear, User createdBy, String filename) {
        this.brand = brand;
        this.name = name;
        this.creationYear = creationYear;
        this.createdBy = createdBy;
        this.filename = filename;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(String creationYear) {
        this.creationYear = creationYear;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "Synthesizer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", creationYear='" + creationYear + '\'' +
                ", createdBy=" + createdBy +
                '}';
    }
}
