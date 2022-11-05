package com.hostmdy.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.hostmdy.di.controller.ConstructorInjectedController;
import com.hostmdy.di.controller.ContextController;
import com.hostmdy.di.controller.I18nGreetingController;
import com.hostmdy.di.controller.PetController;
import com.hostmdy.di.controller.PropertyInjectedController;
import com.hostmdy.di.controller.SetterInjectedController;

@SpringBootApplication
@ComponentScan({"com.hostmdy.service",
	"com.hostmdy.di.controller",
	"com.hostmdy.di.config",
	"com.hostmdy.di.repository"})
public class SpringDiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiTestApplication.class, args);
		
		ContextController contextController = (ContextController) context.getBean("contextController");
		
		System.out.println(contextController.sayHello());
		
		PropertyInjectedController propertyInjectedBean = context.getBean(PropertyInjectedController.class);		
		System.out.println("propertyInjectedBean : "+propertyInjectedBean.sayHello());
		
		SetterInjectedController setterInjectedBean = context.getBean(SetterInjectedController.class);		
		System.out.println("SetterInjectedBean : "+setterInjectedBean.sayHello());
		
		ConstructorInjectedController constructorInjectedBean = context.getBean(ConstructorInjectedController.class);
		System.out.println("ConstructorInjectedBean : "+constructorInjectedBean.sayHello());
		
//		I18nGreetingController i18nBean = context.getBean(I18nGreetingController.class);
//		System.out.println("i18n Bean : "+i18nBean.sayHello());
		
		PetController petBean = context.getBean("petController",PetController.class);
		System.out.println(petBean.getPetType());
	}

}
