package com.softtron.spring.domains.感知接口之BeanClassLoader;

import org.springframework.beans.factory.BeanClassLoaderAware;

public class Service implements BeanClassLoaderAware {
	
	private ClassLoader classLoader;
	
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
		try {
			Class clazzClass = Class.forName("com.softtron.spring.domains.感知接口之BeanClassLoader.TUser");
			System.out.println(clazzClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
