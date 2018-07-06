package com.in28minutes.spring.basics.Springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {
	//What are the beans ?
	//What are the dependencies ?
	//Where to search for beans ? 
	
	public static void main(String[] args) {
		//binarySearchImpl binarySearch = new binarySearchImpl(new QuickSortAlgorithm());
		ConfigurableApplicationContext run = SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearchImpl binarySearch = run.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = run.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int res = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(res);
	}
}
