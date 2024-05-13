package com.web.flip.controllerpack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.flip.dto.LoginDto;
import com.web.flip.dto.LoginResponseDto;
import com.web.flip.entity.UserEntity;
import com.web.flip.servicepack.UserService;

@RestController
@RequestMapping("api/v1")
@CrossOrigin
public class UserController {
  
	@Autowired
	private UserService userService;
	 
	@PostMapping("/register")
	public String postUserData(@RequestBody UserEntity userEntity) {
	
		
	return 	userService.postUserData(userEntity);
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponseDto> isLogin(@RequestBody LoginDto loginDto) {
		
  	return  userService.isLogin(loginDto);
		
		
		
	}
	
}
