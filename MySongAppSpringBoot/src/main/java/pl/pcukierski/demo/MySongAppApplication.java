package pl.pcukierski.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class MySongAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySongAppApplication.class, args);
	}

}
