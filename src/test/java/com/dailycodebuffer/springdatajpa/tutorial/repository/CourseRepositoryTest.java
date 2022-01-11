package com.dailycodebuffer.springdatajpa.tutorial.repository;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.springdatajpa.tutorial.entity.Course;

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
}
