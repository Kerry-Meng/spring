package spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.beanfactorypostprocessor.DatabaseConnection;

public class BeanFactoryPostProcessorTest {
	
	@Test
	public void test() {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryPostProcessor.xml");
//		TUser user = (TUser) context.getBean("user");
//		System.out.println(user);
//		context.registerShutdownHook();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryPostProcessor.xml");
		DatabaseConnection dConnection = (DatabaseConnection) context.getBean("db");
		System.out.println(dConnection);
		context.registerShutdownHook();
	}
	
}
