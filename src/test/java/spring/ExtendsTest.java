package spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.继承.Male;
import com.softtron.spring.domains.继承.Person;

public class ExtendsTest {
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("extends.xml");
		Male male = (Male) context.getBean("male");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		System.out.println(male);
		
	}
	
}
