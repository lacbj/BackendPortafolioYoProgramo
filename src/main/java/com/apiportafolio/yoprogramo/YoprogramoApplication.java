package com.apiportafolio.yoprogramo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class YoprogramoApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoprogramoApplication.class, args);
	}


   @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:4200" , "https://argprogramaportafolio-224dc.web.app/").allowedMethods("*").allowedHeaders("*");
            }

        }; 
                }
}