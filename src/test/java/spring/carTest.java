package spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.DB;
import com.softtron.spring.domains.DBUtil;
import com.softtron.spring.domains.实例化工厂方式.Teacher;
import com.softtron.spring.domains.集合.Student;



public class carTest {
	
	
	public void text() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		TCar car = (TCar) context.getBean("car");
//		System.out.println(car.getCarName());
//		System.out.println(car.getFrame().getFrameName());
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Teacher teacher = (Teacher) context.getBean("teacher");
//		System.out.println(teacher.getClazz().getClacsName());
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Teacher teacher = (Teacher) context.getBean("teacher");
//		System.out.println(teacher.getClacs().getClacsName());
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Teacher teacher = (Teacher) context.getBean("teacher");
//		System.out.println(teacher.getClacs().getClacsName());
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		DB db = (DB) context.getBean("DB");
//		System.out.println(db);
		
		//拿取属性值
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		DB db = (DB) context.getBean("DB");
//		System.out.println(db.getProperties());
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		DBUtil dbUtil = (DBUtil) context.getBean("DBUtil");
//		System.out.println(dbUtil.getDb().getProperties());
	}
	
	@Test
	public void whoStudent() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student) context.getBean("st");
		System.out.println(student.getFoot());
	}
	
}
