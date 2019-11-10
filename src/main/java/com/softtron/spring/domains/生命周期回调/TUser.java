package com.softtron.spring.domains.生命周期回调;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TUser implements InitializingBean,DisposableBean{

	public TUser() {
		System.out.println("实例化");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("对象销毁");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("对象初始化完成!");
	}
	
	public void test() {
		System.out.println("test");
	}
	
}
