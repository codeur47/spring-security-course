package com.yorosoft.springsecuritycourse;

import com.yorosoft.springsecuritycourse.model.AppUser;
import com.yorosoft.springsecuritycourse.model.Role;
import com.yorosoft.springsecuritycourse.service.AppUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityCourseApplication.class, args);
	}

	@Bean
	CommandLineRunner run(AppUserService appUserService) {
		return args -> {
			appUserService.saveRole(new Role(null, "ROLE_USER"));
			appUserService.saveRole(new Role(null, "ROLE_MANAGER"));
			appUserService.saveRole(new Role(null, "ROLE_ADMIN"));
			appUserService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			appUserService.saveAppUser(new AppUser(null,"John Travolta", "john", "1234", new ArrayList<>()));
			appUserService.saveAppUser(new AppUser(null,"Will", "keen", "4567", new ArrayList<>()));
			appUserService.saveAppUser(new AppUser(null,"Jacky", "koun", "4123", new ArrayList<>()));
			appUserService.saveAppUser(new AppUser(null,"Demarie", "roctor", "9632", new ArrayList<>()));

			appUserService.addRoleToAppUser("john","ROLE_USER");
			appUserService.addRoleToAppUser("keen","ROLE_MANAGER");
			appUserService.addRoleToAppUser("koun","ROLE_ADMIN");
			appUserService.addRoleToAppUser("roctor","ROLE_SUPER_ADMIN");
		};
	}

}
