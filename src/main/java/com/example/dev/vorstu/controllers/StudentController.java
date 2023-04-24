package com.example.dev.vorstu.controllers;

import com.example.dev.vorstu.service.StudentService;
import com.example.dev.vorstu.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/base/")
public class StudentController {

    @Autowired
    public StudentService studentService;


    @GetMapping("students")
    public List<StudentDto> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("students/{id}")
    public StudentDto getStudentId(@PathVariable("id") Long id) {
        return studentService.getStudentId(id);
    }


    @PostMapping(value = "students", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public StudentDto createStudent(@RequestBody StudentDto studentDto) {
        return studentService.addStudent(studentDto);
    }


    @PutMapping(value = "students", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public StudentDto changeStudent(@RequestBody StudentDto changingStudentDto) {
        return studentService.updateStudent(changingStudentDto);
    }

    @DeleteMapping(value = "students/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Long deleteStudent(@PathVariable("id") Long id) {
        return studentService.removeStudent(id);
    }

}
