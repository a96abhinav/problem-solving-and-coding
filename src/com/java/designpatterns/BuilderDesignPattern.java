package com.java.designpatterns;

class User {
	int userId;
	String userName;
	String userEmail;

	private User(UserBuilder builder) {
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.userEmail = builder.userEmail;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public static class UserBuilder {
		int userId;
		String userName;
		String userEmail;

		public UserBuilder setUserId(int userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setUserEmail(String userEmail) {
			this.userEmail = userEmail;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}

}

public class BuilderDesignPattern {
	
	public static void main(String[] args) {
		
		User user = new User.UserBuilder().setUserEmail("XYZ@gmail.com").setUserId(1).setUserName("Abhinav").build();
		System.out.println(user);
		
	}
}
