package com.dailycodebuffer.springdatajpa.tutorial.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
	@OneToOne(mappedBy="course")// It means It is mapped by course attribut in CourseMaterial class. So JoinColumn is not required here.
	private CourseMaterial courseMaterial;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(
			name="teacher_id",
			referencedColumnName="teacher_id"
			)
	private Teacher teacher;
}
