package org.thy.thy;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThyApplication.class, args);
	}

	@Bean
	public ModelMapper getmodelMapper(){
		return new ModelMapper();
	}

}
