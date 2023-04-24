package com.example.dev.vorstu.mappers;

import com.example.dev.vorstu.dto.StudentDto;
import com.example.dev.vorstu.model.Student;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR) // означает, что зависимости должны быть переданы через конструктор объекта со всеми зависимостями
public interface StudentMapper {
    //target-то место, куда кладу данные из universityId в unviersity
    // .id - берем поле id из dto и кладем его в сущность university.id(поле id)
    // source - место откуда берем данные
    @Mapping(target = "university.id", source = "university")
    Student convert(@MappingTarget Student entity, StudentDto dto);

    @InheritInverseConfiguration // чтобы не писать 2 раза маппинги(перенос из одного поля в другое)
    StudentDto convert(Student entity);
    //студент -> дто, а в 14 стр наоборот
}
