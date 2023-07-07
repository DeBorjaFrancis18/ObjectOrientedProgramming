package fundamentals;

public class User {
	
	private int userID;
	private String username;
	private String firstName, lastName;
	
	User(int userID, String username, String firstName, String lastName){
		this.userID = userID;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	int getUserID() {
		return userID;
	}
	
	void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	void setLastName (String lastName) {
		this.lastName = lastName;
	}

	String getFirstName () {
		return firstName;
	}
	
	String getLastName () {
		return lastName;
	}
	
}
