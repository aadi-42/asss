package com.cg.spring;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("message.xml");
		MessageSource mSource = (MessageSource) ctx.getBean("messageSource");
		Locale locale = new Locale("in", "HN");
		String msg = mSource.getMessage("welcome.message", null, locale);
		System.out.println(msg);
	}

}
