package com.hostmdy.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleTest implements InitializingBean,
DisposableBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware{
	
	public BeanLifeCycleTest() {
		// TODO Auto-generated constructor stub
		System.out.println("### bean is instatiated ###");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("###Notified New Bean to Application Context Container ###");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("### bean is set to Bean Factory ###");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("### Bean is named : "+name);
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("### beanLifeCycleTest is destory");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("### After bean is set all properties ###");
		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("### bean is successfully constructed ###");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("### bean is about to destoroy ###");
	}
	
	public void beforeInitialize() {
		System.out.println("### before bean is initialize");
	}
	
	public void afterInitailize() {
		System.out.println("### after bean is initialize");
	}

}
