package com.abdoulc.springboot.swaggerexample.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.PathSelectors;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.abdoulc.springboot.swaggerexample"))
				.paths(PathSelectors.regex("/rest.*"))
				.build()
				.apiInfo(customInfo());
	}
	
	//Customize your Api Info
	private ApiInfo customInfo() {
		List<VendorExtension> vendorExtensions = new ArrayList<>();
		
		ApiInfo customInfo = new ApiInfo(
				"Documentation using Swagger2 in Spring Boot",
				"desc: how to use Swagger2 in Spring Boot",
				"1.0",
				"Term of Service",
				new Contact("Abdel", "https://github.com/abdoulc", "abdoulrazak1996@gmail.com"),
				"Apache License Version 2.0",
				"https://www.apache.org/license.html",
				vendorExtensions
			);
		return customInfo;
	}
}
