package xyz.utkarshgoyal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//this annotation will let spring know that this configuration is for WEB MVC PROJECT
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "xyz.utkarshgoyal.controller")
public class LoveCalculatorAppConfig {
	
	//Setting up view Resolver 
	@Bean
	InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/view/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}

}
