package com.proyect.User.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.ExternalDocumentation;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI EventOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("User API").description("Documentation from API").version("v1.0")
				.contact(new Contact().name("LucaTicket").url("https://LucaTicket.es")
				.email("LucaTicket@hotmail.com"))
				.license(new License().name("LICENSE").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
				.description("project where a variety of concerts and events are available for sale.")
				.url("https://LucaTicket.es"));
	}
}
