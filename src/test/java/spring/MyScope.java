package spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.spring.domains.自定义作用域.TCar;
import com.softtron.spring.domains.自定义作用域.ThreadScope;

public class MyScope {
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MyScope.xml");
		Scope threadScope = new ThreadScope();
		//1.通过进行注册的方式进行获取自定义作用域的名称
//		自定义作用域的名字通过bean的感知，直接获取到，不用自己定义,这也是一个感知能力，
//		也就是即将所说的感知接口BeanNameAware
//		context.getBeanFactory().registerScope("thread", threadScope);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				TCar car =  (TCar) context.getBean("car");
				System.out.println(car.hashCode());
			}
		}).start();
		
		TCar car2 = (TCar) context.getBean("car");
		System.out.println(car2.hashCode());
	}
	
}
