package com.dailycodebuffer.springdatajpa.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dailycodebuffer.springdatajpa.tutorial.entity.Student;
import com.dailycodebuffer.springdatajpa.tutorial.repository.StudentRepository;

@SpringBootApplication
public class SpringDataJpaTutorialApplication {
	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaTutorialApplication.class, args);
	}

//    @Bean
//    CommandLineRunner commandLineRunner(final StudentRepository studentRepository) {
//        return args -> {
//        	Student student= Student.builder()
//					 .firstName("Arvind")
//					 .lastName("Kumar")
//					 .emailId("arvindkushwaha021@gmail.com")
//					 .guardianName("Chandra Shekhar")
//					 .guardianMobile("9999195957")
//					 .guardianEmail("abc@gmail.com")
//					 .build();
//	studentRepository.save(student);
//        };
//    }
}
