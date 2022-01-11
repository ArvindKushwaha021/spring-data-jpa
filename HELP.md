one-to-many and many-to-one relationships

1. one-to-many-> one to many is used when we declare a list of items in class
e.g
Here a teacher can teach many courses to we have defined list of courses in Teacher entity.As database could not have the list of courses So the join column will be created in course table where the foreig key will be teacher_id and multiple course rows will be mapped to a single teacher.
	
	@OneToMany(
			cascade=CascadeType.ALL
			)
	@JoinColumn(
			name="teacher_id",
			referencedColumnName="teacher_id"
			)
	List<Course> courses;
	
2. Many to One.-> In this case we don't need to create a list of items.
Here we generally create a mapping in the class where many object(rows) class be mapped to single Object or row of other class


	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(
			name="teacher_id",
			referencedColumnName="teacher_id"
			)
	private Teacher teacher;
	
	Note: We can use only of it at a time. Many to one is better and more readable.