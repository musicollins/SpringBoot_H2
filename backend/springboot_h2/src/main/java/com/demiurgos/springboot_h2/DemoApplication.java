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
			repository.save(new Subscriber("John", "Doe", "johndoe@gmail.com"));
			repository.save(new Subscriber("Jane", "Doe", "janedoe@gmail.com"));
			repository.save(new Subscriber("Jack", "Doe", "jackdoe@gmail.com"));
			

		};
	}

}
