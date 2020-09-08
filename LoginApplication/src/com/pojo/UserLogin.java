package com.pojo;

public class UserLogin {

	private String userEmail;
	private String userName;
	private String userMobileNumber;
	private String userpassword;
	private String confirmUserPassword;
	public UserLogin(String userEmail, String userName, String userMobileNumber, String userpassword,
			String confirmUserPassword) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		this.userMobileNumber = userMobileNumber;
		this.userpassword = userpassword;
		this.confirmUserPassword = confirmUserPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobileNumber() {
		return userMobileNumber;
	}
	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getConfirmUserPassword() {
		return confirmUserPassword;
	}
	public void setConfirmUserPassword(String confirmUserPassword) {
		this.confirmUserPassword = confirmUserPassword;
	}
	@Override
	public String toString() {
		return "UserRegistration [userEmail=" + userEmail + ", userName=" + userName + ", userMobileNumber="
				+ userMobileNumber + ", userpassword=" + userpassword + ", confirmUserPassword=" + confirmUserPassword
				+ "]";
	}
	
	
}
