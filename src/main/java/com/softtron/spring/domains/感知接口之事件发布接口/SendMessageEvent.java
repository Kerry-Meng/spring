package com.softtron.spring.domains.感知接口之事件发布接口;

import org.springframework.context.ApplicationEvent;

public class SendMessageEvent extends ApplicationEvent {
	
	private String phone;
	
	public SendMessageEvent(Object source) {
		super(source);
		this.phone = (String) source;
	}
	
}
