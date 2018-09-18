package com.cg;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class InitTraveller implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String name)
			throws BeansException {
		
		System.out.println("Before init: "+obj +", "+name);
		
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String name)
			throws BeansException {
		System.out.println("After init: "+obj +", "+name);
		return obj;
	}

}
