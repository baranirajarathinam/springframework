package com.barani.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.barani.beans.SpringFirstTest;

public class SpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configFile = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		SpringFirstTest sft = (SpringFirstTest)context.getBean("springTest");
		sft.testMe();
	}

}
