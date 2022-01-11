Uni and Bi-directional

	@OneToOne(mappedBy="course")--> It means It is mapped by course attribute in Coursematerial class. So No column will be created.
	private CourseMaterial courseMaterial;