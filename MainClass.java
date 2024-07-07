package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		
	
		     Student s= (Student) context.getBean("s1");
		     
		         String s1= s.getS();
		         System.out.println(s1);
		          
		
		
		

	}

}
