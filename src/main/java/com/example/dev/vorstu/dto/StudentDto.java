package com.example.dev.vorstu.dto;


// изменили university на universityId. чтобы вместо всего json только принимать id
public class StudentDto {
    private Long id;
    private String fio;
    private String group;
    private String phoneNumber;

    private UniversityDto university;

    public StudentDto() {
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

    public UniversityDto getUniversity() {
        return university;
    }

    public void setUniversity(UniversityDto university) {
        this.university = university;
    }
}
