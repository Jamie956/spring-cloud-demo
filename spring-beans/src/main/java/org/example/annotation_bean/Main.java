package org.example.annotation_bean;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	/**
	 * 测试 	@Bean(autowire = Autowire.BY_TYPE)
	 */
	@Test
	public void t1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean(X.class).getY());
	}

	/**
	 * 测试 @Bean(autowireCandidate = false)
	 */
	@Test
	public void t2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
		System.out.println(context.getBean(Z.class).getY());
	}

	/**
	 * 测试 自定义bean注解
	 */
	@Test
	public void t3() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig3.class);
		System.out.println(context.getBean(A.class));
		System.out.println(context.getBean(A.class));
		System.out.println(context.getBean(A.class));
	}

	/**
	 * 测试 @Configuration
	 * 如果不加@Configuration，每次调c 方法都会新创建c实例
	 * 如果加了@Configuration，c方法返回的都是同一个实例
	 */
	@Test
	public void t4() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig4.class);
		//加了 @Configuration 注解的 AppConfig4 是代理对象
		System.out.println(context.getBean(AppConfig4.class));
	}
}