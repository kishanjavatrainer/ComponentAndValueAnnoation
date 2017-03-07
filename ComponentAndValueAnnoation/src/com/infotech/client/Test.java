package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.UserDetails;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		UserDetails userDetails = ctx.getBean("userBean", UserDetails.class);
		
		System.out.println(userDetails.getUserName()+"\t"+userDetails.getPassword());
		((AbstractApplicationContext) ctx).close();
	}

}
