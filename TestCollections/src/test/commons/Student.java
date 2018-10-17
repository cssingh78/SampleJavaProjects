package test.commons;

public class Student {
	private String name;
	private String fatherName;
	private String motherName;
	private char sex;
	private String dob;
	private char grade;
	private int score;
	private Address address;

	/**
	 * Static method to generate sample students
	 * 
	 * @param noOfStudents
	 * @return
	 */
	public static Student[] generateSampleStudents(int noOfStudents) {
		Student[] students = new Student[noOfStudents];
		for (int i = 0; i < noOfStudents; i++) {
			students[i] = generateSampleStudent(i);
		}
		return students;
	}

	/**
	 * Static method to generate a sample student
	 * 
	 * @param index
	 * @return
	 */
	public static Student generateSampleStudent(int index) {
		Student student = new Student();
		student.setName("Student" + index);
		student.setDob("dob" + index);
		student.setGrade('8');
		student.setScore(80 + index / 10);
		student.setFatherName("Father" + index);
		student.setMotherName("Mother" + index);
		Address address = new Address();
		address.setFlatNo("FlatNo" + index);
		address.setAptName("Apt" + index / 10);
		address.setArea("Area" + index / 50);
		address.setCity("Bangalore");
		address.setPinCode("56010" + index / 100);
		student.setAddress(address);
		return student;
	}

	/**
	 * toString() method of root class Object overridden
	 * 
	 */
	public String toString() {
		/*
		 * Field[] fields = this.getClass().getFields(); for(Field field: fields) {
		 * field.getName(); field.get(); }
		 */
		return String.join(", ", "Name:" + this.name, "DOB:" + this.dob, "Grade:" + this.grade,
				"FatherName:" + this.fatherName, "MotherName:" + this.motherName, "Score:" + this.score,
				"Address->" + this.address);
	}

	/**
	 * Overriding equals method of root class Object. 
	 * As a rule, hashCode() method too should be overridden along with equals()
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		boolean isEqual = false;
		if (obj !=null && obj instanceof Student) {
			Student student = (Student) obj;
			isEqual = (student.name==this.name && student.dob == this.dob);
		}
		return isEqual;
	}
	
	/**
	 * Overridding hashCode() method from root class Object.
	 * This method must return the same value for an object consistently
	 * This method must return same value always for equal objects
	 * However it's not needed to return distinct value for unequal objects
	 * Distinct value for unequal objects is preferred for collections performance
	 */
	public int hashCode() {
		return (this.name+this.dob).hashCode();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
