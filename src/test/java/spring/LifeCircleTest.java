package spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.生命周期回调.TUser;
import com.softtron.spring.domains.生命周期回调.TUser2;


public class LifeCircleTest {
	

	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("LifeCircle.xml");
		TUser user = (TUser) context.getBean("user");
		user.test();
		context.registerShutdownHook();//将容器关闭
	}
	
	
	@Test
	public void test2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("LifeCircle.xml");
		TUser2 user2 = (TUser2) context.getBean("user2");
		user2.test();
		context.registerShutdownHook();//将容器关闭
	}
	
}
