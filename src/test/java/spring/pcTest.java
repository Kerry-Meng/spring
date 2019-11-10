package spring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.pc标签的使用.Teacher;

public class pcTest {
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("pc标签.xml");
		Teacher teacher = (Teacher) context.getBean("teacher");
		System.out.println(teacher.getClacs().getClacsName());
	}
	
}
