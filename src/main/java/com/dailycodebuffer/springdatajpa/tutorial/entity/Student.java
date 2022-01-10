package com.dailycodebuffer.springdatajpa.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder=true)
@Table(
		name = "student", 
		uniqueConstraints = @UniqueConstraint(
				name = "emailId_unique", 
				columnNames = "email_id"))
public class Student {
	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence")
	@Column(name = "id")
	private Long studentId;
	@Column(name = "first_name",
			nullable=false)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(
			name = "email_id",
			nullable=false)
	private String emailId;
	@Column(name = "guardian_name")
	private String guardianName;
	@Column(name = "guradian_email")
	private String guardianEmail;
	@Column(name = "guardian_mobile")
	private String guardianMobile;

}
