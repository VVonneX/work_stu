package com.example.dev.vorstu.model;


import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_of_students")
    private Long id;
    @Column(name = "fio_of_students")
    private String fio;
    @Column(name = "group_of_students")
    private String group;
    @Column(name = "phoneNumber_of_students")
    private String phoneNumber;

    //@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL) // какой здесь cascade?
    @ManyToOne(fetch = FetchType.EAGER) // какой здесь cascade?
    @JoinColumn(name = "university_id", referencedColumnName = "university_id")
    private University university;

    public Student(Long id, String fio, String group, String phoneNumber, University university) {
        this.id = id;
        this.fio = fio;
        this.group = group;
        this.phoneNumber = phoneNumber;
        this.university = university;
    }

    public Student() {
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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
