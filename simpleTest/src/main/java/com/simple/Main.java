package com.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
 System.out.println("=======Main=========");
 
 
		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
		System.out.println("================="+context);
		
		EmpService service = (EmpService) context
				.getBean("testService");
		
		 String message = service.sayHello(); 
		 System.out.println(message);
		 
		  //set a new name 
		 service.setName("Spring"); 
		 message = service.sayHello();
		  System.out.println(message);
		 
		
	}
}
