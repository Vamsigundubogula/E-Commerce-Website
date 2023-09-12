package com.ecommerce.signup.action;

public class SignUpAction {

	private String registerNumber;
	private String userName;
	private String passWord;
	private String conformPassword;
	public SignUpAction(String registerNumber, String userName, String passWord, String conformPassword) {
		super();
		this.registerNumber = registerNumber;
		this.userName = userName;
		this.passWord = passWord;
		this.conformPassword = conformPassword;
	}
	public String getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getConformPassword() {
		return conformPassword;
	}
	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}
}
