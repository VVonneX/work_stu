package com.example.dev.vorstu.service;

import com.example.dev.vorstu.dto.StudentDto;
import com.example.dev.vorstu.mappers.StudentMapper;
import com.example.dev.vorstu.model.Student;
import com.example.dev.vorstu.repositories.StudentRepository;
import com.example.dev.vorstu.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UniversityRepository universityRepository;

    @Autowired
    private StudentMapper studentMapper;

    public List<StudentDto> getAllStudents() {

        return studentRepository.findAll()
                .stream()
                .map(student -> studentMapper.convert(student))
                .collect(Collectors.toList());
    }

  /*  public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDto = students.stream().map(el -> {
            StudentDto dto = StudentDto.convertToDto(el);
            dto.setUniversity(UniversityDto.convertToDto(el.getUniversity()));
            return dto;
        }).collect(Collectors.toList());
        return studentDto;
    }*/

    public StudentDto getStudentId(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new RuntimeException(String.format(
                        "студент с id %d не найден", id)));

        return studentMapper.convert(student);

    }

    public StudentDto addStudent(StudentDto studentDto) {
        Student toSave = studentMapper.convert(new Student(), studentDto);

        return studentMapper.convert(studentRepository.save(toSave));
    }

    public StudentDto updateStudent(StudentDto studentDto) {

        return addStudent(studentDto);
    }

    public Long removeStudent(Long id) {

        studentRepository.deleteById(id);

        return id;
    }
}
