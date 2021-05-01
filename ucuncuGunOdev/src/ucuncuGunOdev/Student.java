package ucuncuGunOdev;

public class Student extends User {

	public Student(int id, String firstName, String lastName, String email) {
		super(id, firstName, lastName, email);

	}

	String learningCourse;

	public String getLearningCourse() {
		return learningCourse;
	}

	public void setLearningCourse(String learningCourse) {
		this.learningCourse = learningCourse;
	}

}
