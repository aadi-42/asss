package com.cg.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.cg.spring")
@EnableAutoConfiguration
@PropertySource("classpath:/emp.properties")
public class EmpClient {
	
	@Autowired
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EmpClient.class, args);
		EmpBean bean = (EmpBean) ctx.getBean("emp");
		System.out.println(bean);
		bean.print();

	}

}
