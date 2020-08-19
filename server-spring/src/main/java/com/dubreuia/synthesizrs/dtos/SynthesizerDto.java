package com.dubreuia.synthesizrs.dtos;

import com.dubreuia.synthesizrs.model.Synthesizer;

public class SynthesizerDto {

    private long id;

    private String name;

    private String brand;

    private String creationYear;

    private String createdByUsername;

    public SynthesizerDto() {
    }

    public SynthesizerDto(Synthesizer synthesizer) {
        this.id = synthesizer.getId();
        this.name = synthesizer.getName();
        this.brand = synthesizer.getBrand();
        this.creationYear = synthesizer.getCreationYear();
        this.createdByUsername = synthesizer.getCreatedBy().getUsername();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(String creationYear) {
        this.creationYear = creationYear;
    }

    public String getCreatedByUsername() {
        return createdByUsername;
    }

    public void setCreatedByUsername(String createdByUsername) {
        this.createdByUsername = createdByUsername;
    }
}
