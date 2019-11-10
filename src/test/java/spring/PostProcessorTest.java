package spring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.后处理器BeanPostProcessor.PostProcessor;
import com.softtron.spring.domains.后处理器BeanPostProcessor.User;

public class PostProcessorTest {
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("postProcessor.xml");
//		PostProcessor postProcessor =  (PostProcessor) context.getBean("postProcessor");
		User user = (User) context.getBean("user");
		context.registerShutdownHook();
	}
	
}
