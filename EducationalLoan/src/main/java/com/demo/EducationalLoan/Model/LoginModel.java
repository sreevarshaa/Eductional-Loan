package com.demo.EducationalLoan.Model;


import jakarta.persistence.Id;


public class LoginModel {
       @Id
       private String Email;
       private String Password;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public LoginModel(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	@Override
	public String toString() {
		return "Login [Email=" + Email + ", Password=" + Password + "]";
	}
	public LoginModel() {
		super();
	}
       
}
