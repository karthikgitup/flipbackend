package com.web.flip.servicepack;

import org.springframework.http.ResponseEntity;

import com.web.flip.dto.LoginDto;
import com.web.flip.dto.LoginResponseDto;
import com.web.flip.entity.UserEntity;

public interface UserService {
	
	public String postUserData(UserEntity userEntity);
	
	public ResponseEntity<LoginResponseDto> isLogin(LoginDto loginDto);

}
