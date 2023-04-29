package com.example.dev.vorstu.service;

import com.example.dev.vorstu.dto.StudentDto;
import com.example.dev.vorstu.mappers.StudentMapper;
import com.example.dev.vorstu.mappers.UniversityMapper;
import com.example.dev.vorstu.model.Student;
import com.example.dev.vorstu.repositories.StudentRepository;
import com.example.dev.vorstu.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    private final UniversityRepository universityRepository;

    private final StudentMapper studentMapper;

    private final UniversityMapper universityMapper;

    @Autowired
    public StudentService(StudentRepository studentRepository, UniversityRepository universityRepository, StudentMapper studentMapper, UniversityMapper universityMapper) {
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
        this.studentMapper = studentMapper;
        this.universityMapper = universityMapper;
    }

    public List<StudentDto> getAllStudents() {

        return studentRepository.findAll()
                .stream()
                .map(student -> studentMapper.convert(student))
                .collect(Collectors.toList());

    }

    public StudentDto getStudentId(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new RuntimeException(String.format(
                        "студент с id %d не найден", id)));

        return studentMapper.convert(student);

    }

    public StudentDto addStudent(StudentDto studentDto) {
        Student toSave = studentMapper.convert(studentDto);
      //  studentDto.setUniversity(universityMapper.convert(studentDto.getUniversity(), new UniversityDto()));
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
