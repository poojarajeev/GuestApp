package com.project.GuestApplication;

import com.project.GuestApplication.guest.dao.GuestDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuestApplication {


	private GuestDao guestDao;

	public static void main(String[] args) {
		SpringApplication.run(GuestApplication.class, args);
	}

}
