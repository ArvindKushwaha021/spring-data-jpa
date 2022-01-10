package com.dailycodebuffer.springdatajpa.tutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.springdatajpa.tutorial.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	List<Student> findByFirstName(String firstName);
	List<Student> findByFirstNameContaining(String name);
	List<Student> findByLastNameNotNull();
	List<Student> findByGuardianName(String guardianName);
	List<Student> findByFirstNameAndLastName(String guardianName);
	List<Student> findByGuardianNameOrLastName(String guardianName);
	List<Student> findByFirstNameIgnoreCase(String firstName);



}
