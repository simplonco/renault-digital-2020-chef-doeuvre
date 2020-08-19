package com.dubreuia.synthesizrs.dtos;

public class SynthDto {

    private int id;

    private String name;

    private String company;

    private String creationYear;

    public SynthDto(int id, String name, String company, String creationYear) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.creationYear = creationYear;
    }

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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(String creationYear) {
        this.creationYear = creationYear;
    }

}
