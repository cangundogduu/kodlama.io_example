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
		
		
		Instructor ınstructor=new Instructor(1, "Engın", "Demırog", "engin@engin.com", "1234", "C#,Java,Python");
		
		
		UserManager usermanager= new UserManager();
		usermanager.add(ınstructor);
		usermanager.add(student);
		usermanager.delete(ınstructor);
		usermanager.update(student);
		
		StudentManager studentManager=new StudentManager();
		studentManager.studentStatusIsInCourse(student);
		

	}

}
