package com.softtron.spring.domains.方法注入;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 首先实现ApplicationContextAware接口
 * 从applicationContextAware接口中拿到applicationContextAware对象
 * 
 * @author Administrator
 *
 */
public class Police implements ApplicationContextAware{
	
	private Xiaotou tou;
	private ApplicationContext applicationContext;
	
	public Police() {
		super();
	}
	
	public Police(Xiaotou tou) {
		super();
		this.tou = tou;
	}
	
	public Xiaotou getTou() {
		return tou;
	}
	
	public void setTou(Xiaotou tou) {
		this.tou = tou;
	}
	
	public Xiaotou getXiaotou() {
		//将赋值完之后的对象，在重新获取getbean名字,这时就是多例的
		return (Xiaotou) this.applicationContext.getBean("tou");
	}

	@Override
	public String toString() {
		return "Police [tou=" + tou + "]";
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;//将传过来的对象进行赋值
	}
	
	
}
