package com.dailycodebuffer.springdatajpa.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
	@SequenceGenerator(
			name="course_sequence",
			sequenceName="course_sequence",
			allocationSize=1)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="course_sequence")
	
	
	@Id
	@Column(name="course_id")
	private Long courseId;
	private String title;
	private Integer credit;
}
