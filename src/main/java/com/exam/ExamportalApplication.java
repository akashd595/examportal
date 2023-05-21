package com.exam;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRoles;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;


	public static void main(String[] args) {
		SpringApplication.run(ExamportalApplication.class, args);
	}

	@Override
	public void run(String... args)throws Exception{
		System.out.println("starting...");

//		User user = new User();
//		user.setFirstName("akash");
//		user.setLastName("das");
//		user.setUsername("akash1");
//		user.setProfile("default.png");
//		user.setEmail("aka@aka.com");
//		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
//
//		Role role1 = new Role();
//		role1.setRoleName("ADMIN");
////		role1.setId(45L);  -- I do not need to set the role ID since I have made it auto generate
//
//		Set<UserRoles> userRolesSet = new HashSet<>();
//		UserRoles userRoles = new UserRoles();
//		userRoles.setRole(role1);
//		userRoles.setUser(user);
//
//		userRolesSet.add(userRoles);
//
//		User user1 = this.userService.createUser(user, userRolesSet);
//		System.out.println(user1);

	}
}
