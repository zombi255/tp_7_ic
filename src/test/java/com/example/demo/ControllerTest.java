package com.example.demo;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ControllerTest {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	@Order(1)
	void shouldSaveStudent() {
		Student student = new Student();
		student.setName("imed");
		
		studentRepository.save(student);
		
		assertThat(studentRepository.count()).isEqualTo(1);
	}
	
	@Test
	@Order(2)
	void shouldFindAllStudents() {
		List<Student> students = studentRepository.findAll();
		assertThat(students).hasSize(1);
		assertThat(students.get(0).getName()).isEqualTo("imed");
	}

}