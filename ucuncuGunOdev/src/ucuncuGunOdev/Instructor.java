package ucuncuGunOdev;

public class Instructor extends User {

	private String teachingCourse;

	public Instructor(int id, String firstName, String lastName, String email){
		super(id, firstName, lastName, email);

	}

	public String getTeachingCourse() {
		return teachingCourse;
	}

	public void setTeachingCourse(String teachingCourse) {
		this.teachingCourse = teachingCourse;
	}

}
