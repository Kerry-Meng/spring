package com.softtron.spring.domains.生命周期回调;

public class TUser2 {

	public TUser2() {
		System.out.println("实例化");
	}

	public void destroy() throws Exception {
		System.out.println("对象销毁");
	}


	public void afterPropertiesSet() throws Exception {
		System.out.println("对象初始化完成!");
	}
	
	public void test() {
		System.out.println("test");
	}
	
}
