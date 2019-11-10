package spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanClassloaderTest {
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("BeanClassloaderAware.xml");
	}
	
}
