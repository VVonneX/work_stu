package com.example.dev.vorstu.mappers;

import com.example.dev.vorstu.dto.StudentDto;
import com.example.dev.vorstu.dto.UniversityDto;
import com.example.dev.vorstu.model.Student;
import com.example.dev.vorstu.model.University;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring") // означает, что зависимости должны быть переданы через конструктор объекта со всеми зависимостями
public interface StudentMapper {
    //target-то место, куда кладу данные из university модели в unviersity дто
    // .id - берем поле id из dto и кладем его в сущность university.id(поле id)
    // source - место откуда берем данные

    Student convert(StudentDto dto);

    StudentDto convert(Student entity);

    @Mapping(target = "students", source = "students")
    University convert(UniversityDto dto);
    @Mapping(target = "students", ignore = true)
    UniversityDto convert(University entity);

}


