package ucuncuGunOdev;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor(1, "Engin", "Demiro�", "abc@abc.com");
		instructor.setTeachingCourse("C# + Angular ��retiyorsunuz.");
		System.out.println(instructor.getTeachingCourse());
		
		Student student = new Student(1, "Yasemin", "G�nel", "abc@abc.com");
		student.setLearningCourse("Java + React ��reniyorsunuz.");
		System.out.println(student.getLearningCourse());
		System.out.println("-----------------------------");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add("Java + React");
		instructorManager.remove("C# + Angular");
		instructorManager.update("Java + React");
		instructorManager.list("Engin Demiro�");
		System.out.println("-----------------------------");
		StudentManager studentManager = new StudentManager();
		studentManager.add("Hesap");
		studentManager.remove("Hesap");
		studentManager.update("Hesap");
		studentManager.beginCourse();
		studentManager.endCourse();
		System.out.println("-----------------------------");
		UserManager[] userManagers = new UserManager[] { new StudentManager(), new InstructorManager() };
		for (UserManager userManager : userManagers) {
			userManager.add();
		}
	}
}
