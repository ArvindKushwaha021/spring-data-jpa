package com.dailycodebuffer.springdatajpa.tutorial.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.springdatajpa.tutorial.entity.Guardian;
import com.dailycodebuffer.springdatajpa.tutorial.entity.Student;

@SpringBootTest
public class StudentRepositoryTest {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Test
	public void saveStudent() {
		
		Student student= Student.builder()
						 .firstName("Arvind")
						 .lastName("Kushwaha")
						 .emailId("arvindkumar18081991@yahoo.com")
						 //.guardianName("Chandra Shekhar")
						 //.guardianMobile("9999195957")
						 //.guardianEmail("abc@gmail.com")
						 .build();
		studentRepository.save(student);
	}
	
	@Test
	public void saveStudentWithGuardian() {
		Guardian guardian=Guardian.builder()
							.name("Charndra Shekhar")
							.email("abc.email.com")
							.mobile("9999195957")
							.build();
		
		Student student= Student.builder()
						 .firstName("Sangeeta")
						 .lastName("Kumari")
						 .emailId("sangeeta1@yahoo.com")
						 .guardian(guardian)
						 .build();
		studentRepository.save(student);
	}
	
	@Test
	public void printAllStudent() {
		List<Student> listOfStudent=studentRepository.findAll();
		System.out.println("list of students :"+ listOfStudent);
		
	}

}
