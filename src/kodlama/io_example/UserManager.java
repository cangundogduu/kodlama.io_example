package kodlama.io_example;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" is added.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" is delected.");
	}
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" is updated.");
	}
}
