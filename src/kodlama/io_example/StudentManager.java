package kodlama.io_example;

public class StudentManager extends UserManager{
	public void studentStatusIsInCourse(Student student) {
		if(student.getStatus()==true) {
		System.out.println("Student is successful :"+student.getFirstName()+" "+student.getLastName());
		}
		else {
			System.out.println("Student is not successful :"+student.getFirstName()+" "+student.getLastName());	
		}
	}
	
}
