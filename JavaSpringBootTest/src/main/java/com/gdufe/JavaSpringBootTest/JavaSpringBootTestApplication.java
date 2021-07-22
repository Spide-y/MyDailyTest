package com.gdufe.JavaSpringBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.gdufe.JavaSpringBootTest"})
@EnableSwagger2
public class JavaSpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootTestApplication.class, args);
	}

}
