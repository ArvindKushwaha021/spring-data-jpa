package com.dailycodebuffer.springdatajpa.tutorial.repository;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.springdatajpa.tutorial.entity.Course;
import com.dailycodebuffer.springdatajpa.tutorial.entity.Teacher;

@SpringBootTest
public class CourseRepositoryTest {
	
	@Autowired
	CourseRepository repository;
	
	@Test
	public void saveCourse() {
		Course course = Course.builder()
							  .title("Java")
							  .credit(6).build();
		repository.save(course);
	}
	
	@Test
	public void printCourse() {
		System.out.println("Courses: "+ repository.findAll());
	}
	
	@Test
	public void saveCourseManyToOne() {
		
		Teacher teacher=Teacher.builder()
							   .firstName("Abhay")
							   .lastName("mishra")
							   .build();
		
		Course course=Course.builder()
							.credit(9)
							.title("Docker")
							.teacher(teacher)
							.build();
		repository.save(course);
	}
}
