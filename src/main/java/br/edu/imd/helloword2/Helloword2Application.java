package br.edu.imd.helloword2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController
public class Helloword2Application {

	public static void main(String[] args) {
		SpringApplication.run(Helloword2Application.class, args);
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World" ) String name) {
		return String.format("Hello %s", name);
		
	}

	

}
