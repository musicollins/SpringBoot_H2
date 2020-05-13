package com.demiurgos.springboot_h2;

import com.demiurgos.springboot_h2.domain.Subscriber;
import com.demiurgos.springboot_h2.domain.SubscriberRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner( SubscriberRepository repository){
		return args -> {
			repository.save(new Subscriber("Jax", "Briggs", "jax@gmail.com", "mortal-kombat"));
			repository.save(new Subscriber("Sinder", "Fire", "sinder@gmail.com", "killer-instinct"));
			repository.save(new Subscriber("Wolka", "Chin", "rideeeee@gmail.com", "street-fighter"));
			

		};
	}

}
