package spring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.变量作用域.TCar;

public class ZuoYY {
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("变量作用域.xml");
		TCar car = (TCar) context.getBean("car");
		System.out.println(car.hashCode());
		TCar car2 = (TCar) context.getBean("car");
		System.out.println(car2.hashCode());
	}
	
}
