package kodlama.io_example;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Can");
		student.setLastName("Gundogdu");
		student.setEmail("gundogdu.can@hotmail.com");
		student.setPassword("1234");
		student.setStatus(true);
		student.getRegisteredCourses();
		
		
		Instructor �nstructor=new Instructor(1, "Eng�n", "Dem�rog", "engin@engin.com", "1234", "C#,Java,Python");
		
		
		UserManager usermanager= new UserManager();
		usermanager.add(�nstructor);
		usermanager.add(student);
		usermanager.delete(�nstructor);
		usermanager.update(student);
		
		StudentManager studentManager=new StudentManager();
		studentManager.studentStatusIsInCourse(student);
		

	}

}
