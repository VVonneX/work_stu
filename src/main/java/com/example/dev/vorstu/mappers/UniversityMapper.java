package com.example.dev.vorstu.mappers;

import com.example.dev.vorstu.dto.StudentDto;
import com.example.dev.vorstu.dto.UniversityDto;
import com.example.dev.vorstu.model.University;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UniversityMapper {

    University convert(@MappingTarget University entity, UniversityDto dto);

    UniversityDto convert(University entity);

}
