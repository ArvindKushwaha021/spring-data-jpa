package com.dailycodebuffer.springdatajpa.tutorial.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.springdatajpa.tutorial.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	List<Student> findByFirstName(String firstName);
	List<Student> findByFirstNameContaining(String name);
	List<Student> findByLastNameNotNull();
	List<Student> findByGuardianName(String guardianName);
	//List<Student> findByFirstNameAndLastName(String guardianName);
	//List<Student> findByGuardianNameOrLastName(String guardianName);
	List<Student> findByFirstNameIgnoreCase(String firstName);
	
	
	@Query("select s from Student s where s.emailId =?1")
	Student getStudentByEmailAddress(String emailId);
	
	@Query("select s.firstName from Student s where s.emailId =?1")
	String getFirstNameByEmailAddress(String emailId);
	
	@Query(
			value="select * from student s where s.email_id =?1",
			nativeQuery=true)
	Student getFirstNameByEmailAddressNative(String emailId);
	
	@Query(
			value="select * from student s where s.email_id =:email",
			nativeQuery=true)
	Student getFirstNameByEmailAddressNativeNamedParam(@Param("email")String emailId);
	
	@Query(
			value="update student s set s.first_name=:name where s.email_id =:email",
			nativeQuery=true)
	@Modifying
	@Transactional
	int updateFirstNameNative(@Param("email")String emailId, @Param("name") String firstName);
	
	@Query("update Student s set s.firstName=?2 where s.emailId=?1")
	@Modifying
	@Transactional	
	int updateFirstName(String name, String email);



}
