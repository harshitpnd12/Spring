package com.springscore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springscore/ci/ciconfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
	}

}
