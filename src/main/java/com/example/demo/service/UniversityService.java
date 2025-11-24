package com.example.demo.service;
import com.example.demo.model.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UniversityRepository;
import java.util.List;
@Service
public class UniversityService {
    @Autowired
    private UniversityRepository universityRepository;

    public University saveUniversity(University university){
       return universityRepository.save(university);
    }

   public List<University> getAllUniversitys() {
        return universityRepository.findAll();
    }
    
}
