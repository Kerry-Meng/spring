package com.softtron.spring.domains.自定义作用域;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * BeanNameAware接口,具有让bean有自己感知自己叫什么名字的接口
 * 
 * @author Administrator
 *
 */
public class ThreadScope implements Scope, BeanNameAware, ApplicationContextAware, BeanFactoryAware {
	private ApplicationContext applicationContext;
	private BeanFactory benFactory;
	private String name;
	
	// thread ->map ->name,objectFactory.getObject();
	// 其实Object对象就是创建出来的hashmap对象
	ThreadLocal<Object> locals = new ThreadLocal<Object>() {
		@Override
		protected Object initialValue() {
			return new HashMap<String, Object>();// 进行初始化的时候，返回一个hashmap
		}
	};
	
	/**
	 * get方法其实就是getBean，从ClassPathXmlApplicationContext中获取 key:name就是bean的名称
	 * value:从对象工厂中拿出来的对象
	 * 
	 */
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		HashMap map = (HashMap) locals.get();// 首先从当前线程中拿到对象(创建出来的hashmap对象)
		Object ob = null;
		if ((ob = map.get(name)) != null) {// 拿到bean的名称,如果不等于空。就返回
			return ob;
		} else {
			ob = objectFactory.getObject();// 否则从工厂中获取对象
			map.put(name, ob);// 将对象添加到map中，
			locals.set(map);// 添加到ThreadLocal中
			return ob;
		}
	}
	
	@Override
	public Object remove(String name) {
		Map map = (Map) locals.get();// 首先拿到当前线程中共享变量的值
		if (map.get(name) != null) {// 判断拿到的值中的bean的名字是否为空
			locals.remove();// 移除当前线程共享变量的值
			return map.get(name);//
		}
		return null;
	}
	
	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		
	}
	
	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}
	
	@Override
	public String getConversationId() {
		return null;
	}
	
	@Override
	public void setBeanName(String name) {
		// 通过bean的感知，就能拿到context.getBeanFactory(),前提是首先实现ApplicationContextAware接口
		// if (this.applicationContext instanceof ClassPathXmlApplicationContext) {
		// ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext)
		// this.applicationContext;
		// context.getBeanFactory().registerScope(name, this);
		// } else {
		// ((ConfigurableBeanFactory) this.benFactory).registerScope(name, this);
		// }
		
		this.name = name;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.benFactory = beanFactory;
		((ConfigurableBeanFactory) this.benFactory).registerScope(name, this);
	}
	
}
