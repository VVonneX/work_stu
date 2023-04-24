package com.example.dev.vorstu.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "university_id")
    private Long id;

    @Column(name = "name_of_university")
    private String name;

    @Column(name = "fuckyltet_of_university")
    private String fuckyltet;

   // @OneToMany(mappedBy = "university", cascade = CascadeType.ALL, orphanRemoval = true)
    @OneToMany(mappedBy = "university", fetch = FetchType.LAZY)
     private List<Student> students;
    //private List<Student> students = new ArrayList<>();

    public University( Long id, String name, String fuckyltet, List<Student> students) {
        this.id = id;
        this.name = name;
        this.fuckyltet = fuckyltet;
        this.students = students;
    }

    public University() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuckyltet() {
        return fuckyltet;
    }

    public void setFuckyltet(String fuckyltet) {
        this.fuckyltet = fuckyltet;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return this.students;
    }
}
