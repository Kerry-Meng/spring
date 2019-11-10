package spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.感知接口之事件发布接口.MessageService;
import com.softtron.spring.domains.感知接口之事件发布接口.UserService;

public class ApplicationEventPublisher {
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"感知接口之applicationpublisherlistener.xml");
		UserService userService = (UserService) context.getBean("userService");
//		MessageService messageService = (MessageService) context.getBean("messageService");
		userService.register("13153452327");
		
	}
	
}
