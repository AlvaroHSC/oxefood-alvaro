package br.com.ifpe.oxefoodalvaro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OxefoodAlvaroApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxefoodAlvaroApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
