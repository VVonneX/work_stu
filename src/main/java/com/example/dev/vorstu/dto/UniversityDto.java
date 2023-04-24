package com.example.dev.vorstu.dto;

public class UniversityDto {
    private Long id;

    private String name;

    private String fuckyltet;

    public UniversityDto(Long id, String name, String fuckyltet) {
        this.id = id;
        this.name = name;
        this.fuckyltet = fuckyltet;
    }

    public UniversityDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuckyltet() {
        return fuckyltet;
    }

    public void setFuckyltet(String fuckyltet) {
        this.fuckyltet = fuckyltet;
    }

}
