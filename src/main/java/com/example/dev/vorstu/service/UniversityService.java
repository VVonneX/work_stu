package com.example.dev.vorstu.service;

import com.example.dev.vorstu.dto.UniversityDto;
import com.example.dev.vorstu.mappers.UniversityMapper;
import com.example.dev.vorstu.model.University;
import com.example.dev.vorstu.repositories.StudentRepository;
import com.example.dev.vorstu.repositories.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UniversityMapper universityMapper;

    public List<UniversityDto> getAllUniversity() {
        //достал из бд все университеты
        return universityRepository.findAll()
                // превратил в стрим
                .stream()
                //конвертировал в дто
                .map(university -> universityMapper.convert(university))
                // обратно преобразовал в List
                .collect(Collectors.toList());
    }

    public UniversityDto getUniversityId(Long id) {
        //использование findById, чтобы не заменять на optinal
        University university = universityRepository.findById(id).orElseThrow(
                //триггер ошибки
                () -> new RuntimeException(String.format(
                        "университет с id %d не найден", id)));
        //конвератция в дто
        return universityMapper.convert(university);
    }

    public UniversityDto addUniversity(UniversityDto universityDto) {

        //конвертация из дто в сущность
        University toSave = universityMapper.convert(new University(), universityDto);

        //сохранение и конвертация из сущности в дто
        return universityMapper.convert(universityRepository.save(toSave));
    }

    public UniversityDto updateUniversity(UniversityDto universityDto) {

        return addUniversity(universityDto);
    }

    public Long removeUniversity(Long id) {

        universityRepository.deleteById(id);

        return id;
    }
}
