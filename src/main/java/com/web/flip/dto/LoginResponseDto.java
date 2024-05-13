package com.web.flip.dto;

public class LoginResponseDto {
	
	private boolean islogedin;
	public boolean isIslogedin() {
		return islogedin;
	}

	public void setIslogedin(boolean islogedin) {
		this.islogedin = islogedin;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
	
	public LoginResponseDto(boolean islogedin, String message,String email) {
		super();
		this.islogedin = islogedin;
		this.message = message;
		this.email=email;
	}
	public LoginResponseDto(boolean islogedin, String message) {
		super();
		this.islogedin = islogedin;
		this.message = message;
	
	}
 private String email;
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


}
