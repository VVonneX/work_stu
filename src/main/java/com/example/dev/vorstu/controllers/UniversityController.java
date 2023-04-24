package com.example.dev.vorstu.controllers;

import com.example.dev.vorstu.service.UniversityService;
import com.example.dev.vorstu.dto.UniversityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/base/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping("university")
    public List<UniversityDto> getAllUniversity() {
        return universityService.getAllUniversity();
    }

    @GetMapping("university/{id}")
    public UniversityDto getUniversitiesId(@PathVariable("id") Long id) {
        return universityService.getUniversityId(id);
    }

    @PostMapping(value = "university")
    public UniversityDto createUniversity(@RequestBody UniversityDto universityDto) {
        return universityService.addUniversity(universityDto);
    }

    @PutMapping(value = "university")
    public UniversityDto changeUniversity(@RequestBody UniversityDto changingUniversityDto) {
        return universityService.updateUniversity(changingUniversityDto);
    }

    @DeleteMapping(value = "university/{id}")
    public Long deleteStudent(@PathVariable("id") Long id) {
        return universityService.removeUniversity(id);
    }


}
