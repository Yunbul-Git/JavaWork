package com.lec.spring.envirment;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class EnvMain {

	public static void main(String[] args) {
		System.out.println("Main 시작");
		
		// Context -> Envirment -> PropertySources
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment(); // <- ConfigurableApplication
		MutablePropertySources propertySources = env.getPropertySources();
		
		// PropertySources 에 PropertySource 추가
		
		// PropertySource 하나를 생성하여 PropertySource에 추가 : addList() <-- 끝에 추가
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.auth")); // IOException
			
			// 이제, Environment 를 통해 원하는 property에 접근가능
			// 굳이 '어느 PropertySource' 의 '어느 Property'를 지정 할 필요 없다.
			// 어느 'Propery
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw"));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// ctx.load() 안된다.
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx;
		gCtx.load("classpath:appCtx1.xml");
		gCtx.refresh();
		
		
		AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
		
		System.out.println("admin ID : " + adminConnection.getAdminId());
		System.out.println("admin PW : " + adminConnection.getAdminId());
		
		ctx.close();
		System.out.println("종료");
	}
}
