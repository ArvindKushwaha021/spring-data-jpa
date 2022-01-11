package com.dailycodebuffer.springdatajpa.tutorial.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="coursematerial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseMaterial {

	@Id
	@SequenceGenerator(
			name="course_material_sequence",
			sequenceName="course_material_sequence",
			allocationSize=1)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="course_material_sequence")
	@Column(name="course_material_id")
	private Long courseMaterialId;
	private String url;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(
			name="course_id",
			referencedColumnName="course_id")//this is column name not the entity var name
	private Course course;
}
