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
	
	@Test
	public void printStudentByFirstName() {
		List<Student> listOfStudent=studentRepository.findByFirstName("Arvind");
		System.out.println("list of students by firstName as Arvind:"+ listOfStudent);
	}
	

	@Test
	public void printStudentByFirstNameContaining() {
		List<Student> listOfStudent=studentRepository.findByFirstNameContaining("vin");
		System.out.println("list of students by firstName Containing vin:"+ listOfStudent);
	}
	

	@Test
	public void printStudentByLastNameNotNull() {
		List<Student> listOfStudent=studentRepository.findByLastNameNotNull();
		System.out.println("list of students Last name not null"+ listOfStudent);
	}
	
	@Test
	public void printStudentByGuardianName() {
		List<Student> listOfStudent=studentRepository.findByGuardianName("Chandra Shekhar");
		System.out.println("list of students by guardian name as Chandra Shekhar"+ listOfStudent);
	}

}
