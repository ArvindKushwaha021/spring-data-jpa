package com.dailycodebuffer.springdatajpa.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.springdatajpa.tutorial.entity.CourseMaterial;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {

}
