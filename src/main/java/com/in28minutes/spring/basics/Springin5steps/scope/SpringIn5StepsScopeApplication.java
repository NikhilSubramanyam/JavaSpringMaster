package com.in28minutes.spring.basics.Springin5steps.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		//binarySearchImpl binarySearch = new binarySearchImpl(new QuickSortAlgorithm());
		ConfigurableApplicationContext run = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO personDao1 = run.getBean(PersonDAO.class);
		PersonDAO personDao2 = run.getBean(PersonDAO.class);
		LOGGER.info("{}",personDao1);
		LOGGER.info("{}",personDao1.getJdbcConnection());
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
	}
}
