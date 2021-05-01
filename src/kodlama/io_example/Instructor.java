package kodlama.io_example;

public class Instructor extends User{
	
	
public Instructor(int id, String firstName, String lastName, String email, 
		String password,String certificate) {
	super(id, firstName, lastName, email, password);
	this.certificate=certificate;
}

public Instructor() {
	
}

private String certificate;

public String getCertificate() {
	return certificate;
}

public void setCertificate(String certificate) {
	this.certificate = certificate;
}

}