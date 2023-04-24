package com.example.dev.vorstu.dto;

// изменили university на universityId. чтобы вместо всего json только принимать id
public class StudentDto {
    private Long id;
    private String fio;
    private String group;
    private String phoneNumber;

    private Long universityId;

    public StudentDto() {
    }

    public StudentDto(Long id, String fio, String group, String phoneNumber, Long universityId) {
        this.id = id;
        this.fio = fio;
        this.group = group;
        this.phoneNumber = phoneNumber;
        this.universityId = universityId;
    }

    public String getFio() {
        return fio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getUniversity() {
        return universityId;
    }

    public void setUniversity(Long universityId) {
        this.universityId = universityId;
    }
}
