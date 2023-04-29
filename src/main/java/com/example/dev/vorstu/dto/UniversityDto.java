package com.example.dev.vorstu.dto;

import java.util.List;

public class UniversityDto {
    private Long id;

    private String name;

    private String fuckyltet;

    private List<StudentDto> students;

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

    public List<StudentDto> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDto> students) {
        this.students = students;
    }
}
