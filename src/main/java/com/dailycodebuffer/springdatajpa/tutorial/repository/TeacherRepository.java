package com.dailycodebuffer.springdatajpa.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodebuffer.springdatajpa.tutorial.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
