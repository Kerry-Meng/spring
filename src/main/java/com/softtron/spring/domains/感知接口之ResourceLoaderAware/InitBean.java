package com.softtron.spring.domains.感知接口之ResourceLoaderAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class InitBean implements ResourceLoaderAware, BeanFactoryAware {
	
	private ResourceLoader resourceLoader;
	private BeanFactory beanFactory;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
		Resource resource = resourceLoader.getResource("classpath:ReadResource.xml");
		BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) this.beanFactory);
		reader.loadBeanDefinitions(resource);
		System.out.println(this.beanFactory.getBean("me"));
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
}
