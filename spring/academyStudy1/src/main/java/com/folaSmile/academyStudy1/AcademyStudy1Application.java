package com.folaSmile.academyStudy1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan
@SpringBootApplication
public class AcademyStudy1Application {

	public static void main(String[] args) {
		SpringApplication.run(AcademyStudy1Application.class, args);
	}

	@Bean
	public InternalResourceViewResolver setupViewResolver() {

		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}



