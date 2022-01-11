package com.dailycodebuffer.springdatajpa.tutorial.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.springdatajpa.tutorial.entity.Course;
import com.dailycodebuffer.springdatajpa.tutorial.entity.Teacher;

@SpringBootTest
public class TeacherRepositoryTest {
	
	@Autowired
	TeacherRepository repository;
	
	@Test
	public void saveTeacherOneToMany() {
		
		Course course1=Course.builder()
							 .credit(7)
							 .title("DSA")
							 .build();
		
		Course course2=Course.builder()
				 .credit(7)
				 .title(".net")
				 .build();
		List<Course> courses=new ArrayList<>();
		courses.add(course1);
		courses.add(course2);
		
		Teacher teacher=Teacher.builder()
							   .firstName("John")
							   .lastName("Peter")
							  // .courses(courses)
							   .build();
		repository.save(teacher);
	}
	
	}
