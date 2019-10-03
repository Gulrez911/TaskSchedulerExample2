package com.gul.test3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.naming.NamingException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;
import org.springframework.scheduling.concurrent.DefaultManagedTaskScheduler;

public class DefaultManagedTaskSchedulerExample {

	public static void main(String[] args) throws NamingException, InterruptedException {

		SimpleNamingContextBuilder b = new SimpleNamingContextBuilder();
		b.bind("java:comp/DefaultManagedScheduledExecutorService", Executors.newScheduledThreadPool(5));
		b.activate();

		// bootstrapping spring
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		MyBean bean = context.getBean(MyBean.class);
		bean.runTask();
		// shutdown after 10 sec
		Thread.sleep(10000);
		DefaultManagedTaskScheduler scheduler = context.getBean(DefaultManagedTaskScheduler.class);
		Executor exec = scheduler.getConcurrentExecutor();
		ExecutorService es = (ExecutorService) exec;
		es.shutdownNow();
	}
}
