package spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Police {
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("方法注入.xml");
		com.softtron.spring.domains.方法注入.Police2 police = (com.softtron.spring.domains.方法注入.Police2) context.getBean("police");
		System.out.println(police.getXiaotou());
		
	}
	
}
