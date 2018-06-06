package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomPostProcessor implements BeanPostProcessor{
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In After: "+beanName);
		return bean;
		//return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In Before: "+beanName);
		return bean;
		//return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

}
