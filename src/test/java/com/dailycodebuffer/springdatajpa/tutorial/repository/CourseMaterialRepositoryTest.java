package com.dailycodebuffer.springdatajpa.tutorial.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.springdatajpa.tutorial.entity.Course;
import com.dailycodebuffer.springdatajpa.tutorial.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialRepositoryTest {
	@Autowired
	CourseMaterialRepository repository;

	@Test
	public void saveCourseMaterial() {
		Course course = Course.builder().
				credit(7).
				title("SpringBoot")
				.build();
		CourseMaterial cm = CourseMaterial.builder().course(course).url("www.google.com").build();
		
		repository.save(cm);
	}
	
	@Test
	public void printCourseMaterial() {
		System.out.println("Course Material :" +repository.findById(2L));
		
		
	}

}
