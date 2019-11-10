package com.softtron.spring.domains.方法注入;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class Jingju implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		Xiaotou xiaotou = new Xiaotou();
		xiaotou.setName("456");
		return xiaotou;
	}
	
}
