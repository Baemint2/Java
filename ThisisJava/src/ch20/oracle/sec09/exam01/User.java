package ch20.oracle.sec09.exam01;

public class User {
	private String userId;
	private String uesrName;
	private String userPassword;
	private int userAge;
	private String uesrEmail;
	
	public User(String userId, String uesrName, String userPassword, int userAge, String uesrEmail) {
		super();
		this.userId = userId;
		this.uesrName = uesrName;
		this.userPassword = userPassword;
		this.userAge = userAge;
		this.uesrEmail = uesrEmail;
	}

	public User() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUesrName() {
		return uesrName;
	}

	public void setUesrName(String uesrName) {
		this.uesrName = uesrName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUesrEmail() {
		return uesrEmail;
	}

	public void setUesrEmail(String uesrEmail) {
		this.uesrEmail = uesrEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", uesrName=" + uesrName + ", userPassword=" + userPassword + ", userAge="
				+ userAge + ", uesrEmail=" + uesrEmail + "]";
	}
	
	
}
