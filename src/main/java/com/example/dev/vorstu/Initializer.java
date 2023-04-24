package com.example.dev.vorstu;

import com.example.dev.vorstu.repositories.StudentRepository;
import com.example.dev.vorstu.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Initializer {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UniversityRepository universityRepository;

    public void initial() {
        /*University university1 = universityRepository.save(new University("name", "fuckyltet"));
        studentRepository.save(new Student("fio", "def_group", "+79", university1));*/
    }

}
