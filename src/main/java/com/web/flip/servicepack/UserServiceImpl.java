package com.web.flip.servicepack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.web.flip.dto.LoginDto;
import com.web.flip.dto.LoginResponseDto;
import com.web.flip.entity.UserEntity;
import com.web.flip.repopack.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public String postUserData(UserEntity userEntity) {
		
	  userRepository.save(userEntity);
	return userEntity.getUsername();
	
		
	}

	@Override
	public ResponseEntity<LoginResponseDto> isLogin(LoginDto loginDto) {
		
		UserEntity user=userRepository.findByEmail(loginDto.getEmail());
		if(user==null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new LoginResponseDto(false, "Invalid Credentials"));
		}
		return ResponseEntity.ok(new LoginResponseDto(true, "Login Successfull",loginDto.getEmail()));
	}

}
