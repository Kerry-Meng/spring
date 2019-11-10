package spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.dependson.UserDao;

public class JdbcUtilTest {
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbUtil.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		System.out.println(userDao.connection);
	}
	
}
