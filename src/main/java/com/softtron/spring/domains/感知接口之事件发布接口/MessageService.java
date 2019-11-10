package com.softtron.spring.domains.感知接口之事件发布接口;

import org.springframework.context.ApplicationListener;

public class MessageService implements ApplicationListener<SendMessageEvent>{

	@Override
	public void onApplicationEvent(SendMessageEvent event) {
		System.out.println("发送短信!" + event.getSource());
	}
	
}
