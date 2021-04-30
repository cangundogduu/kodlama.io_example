package kodlama.io_example;

public class Student extends User{
	
	
public Student(int id, String firstName, String lastName, String email, String password,
			String[] registeredCourses,boolean status) {
		super(id, firstName, lastName, email, password);
		this.registeredCourses = registeredCourses;
		this.status=status;
	}
public Student() {
	
}
	
	
private String[] registeredCourses= {"C#&Angular","Java&React"};
private boolean status;

	
public boolean getStatus() {
	return status;
}


public void setStatus(boolean status) {
	this.status = status;
}


public String[] getRegisteredCourses() {
		return registeredCourses;
	}

	
	
}
