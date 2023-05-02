package com.example.dev.vorstu.mappers;

import com.example.dev.vorstu.dto.StudentDto;
import com.example.dev.vorstu.dto.UniversityDto;
import com.example.dev.vorstu.model.Student;
import com.example.dev.vorstu.model.University;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UniversityMapper {

   // @Mapping(target = "students", source = "students")
    University convert(UniversityDto dto);

   // @Mapping(target = "students", source = "students")
    UniversityDto convert(University entity);
    @Mapping(target = "university.id", source = "university.id")
    Student convert(StudentDto dto);
    @Mapping(target = "university", ignore = true)
    StudentDto convert(Student entity);


}
