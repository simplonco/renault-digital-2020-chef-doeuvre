package com.dubreuia.synthesizrs.dtos;

import com.dubreuia.synthesizrs.model.Synthesizer;

public class SynthesizerDto {

    private long id;

    private String name;

    private String brand;

    private String creationYear;

    private String createdByUsername;

    private String filename;

    public SynthesizerDto() {
    }

    public SynthesizerDto(Synthesizer synthesizer) {
        this.id = synthesizer.getId();
        this.name = synthesizer.getName();
        this.brand = synthesizer.getBrand();
        this.creationYear = synthesizer.getCreationYear();
        this.createdByUsername = synthesizer.getCreatedBy().getUsername();
        this.filename = synthesizer.getFilename();
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Synthesizer toSynthesizer() {
        return new Synthesizer(this.brand, this.name, this.creationYear, null, this.filename);
    }

}
