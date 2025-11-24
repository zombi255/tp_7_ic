package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.University;
import com.example.demo.service.UniversityService;

@RestController
@RequestMapping("/university")
public class UniversityController {
     @Autowired
     private UniversityService universityService;

@PostMapping("/add")
public String add(@RequestBody University university) {
    universityService.saveUniversity(university);
    return "New university is added";
    }

    @GetMapping("/getAll")
public List<University> getAllUniversity() {
    return universityService.getAllUniversitys();
}
}