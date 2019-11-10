package com.softtron.spring.domains.感知接口之事件发布接口;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class UserService implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher applicationEventPublisher;
	
	//用户注册,传过来一个手机号
	public void register(String phone) {
		System.out.println(phone + "注册完成!");
		//已经完成注册
		this.applicationEventPublisher.publishEvent(new SendMessageEvent(phone));
		//给用户事件通知短信形式，已经注册成功
		System.out.println("发送短信事件完成!");
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
}
