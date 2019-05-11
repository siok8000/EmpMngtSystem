package com.neebal.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neebal.dto.Triangle;

@Configuration
@ComponentScan(basePackages="com.neebal")
public class Test {
	
	public static void main(String args[]){
		ApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
	 	Triangle triangle = context.getBean(Triangle.class);
	 	System.out.println(triangle);
	}

}
