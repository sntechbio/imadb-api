package com.immunoagingdatabase.imadb;

import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class ImadbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImadbApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(new springfox.documentation.service.ApiInfo("Immunology Aging Database", "Immunology Aging Database", "1.0", "Terms of service", "Immunology Aging Database", "License of API", "API license URL"))
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.immunoagingdatabase.imadb.api"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Título da API")
				.description("Descrição da API")
				.version("1.0.0")
				.build();
	}

}
