package com.cg.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("state.xml");
		StateList states = (StateList) ctx.getBean("state");
		System.out.println(states.getStateList());
		System.out.println(states.getStateSet());
		System.out.println(states.getStateMap());
		System.out.println(states.getStateProps());
		System.out.println(states.getEmpSet());

	}

}
