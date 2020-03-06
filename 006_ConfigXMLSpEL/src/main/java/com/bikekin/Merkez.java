package com.bikekin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Yazar yazar = ctx.getBean("yazarBean", Yazar.class);
		
		System.out.println(yazar);

	}

}
