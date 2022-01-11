package com.dailycodebuffer.springdatajpa.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.springdatajpa.tutorial.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
