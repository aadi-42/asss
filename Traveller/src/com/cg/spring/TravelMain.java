package com.cg.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.Vehicle;

public class TravelMain {

	public static void main(String[] args) {
//		ApplicationContext ctx
//		AbstractApplicationContext ctx
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("travel.xml");
		Vehicle v = (Vehicle) ctx.getBean("vehicle");
		v.move();
		ctx.registerShutdownHook();
	}
}
