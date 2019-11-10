package spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.自动装配.TCar;

public class autowire {
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		TCar car = (TCar) context.getBean("car");
		System.out.println(car.getFrame().getFrameName());
	}
	
}
