package com.softtron.spring.domains.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryInit implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] names = beanFactory.getBeanDefinitionNames();
		for (String name : names) {
			if ("user".equals(name)) {
				BeanDefinition bDefinition = beanFactory.getBeanDefinition(name);
				MutablePropertyValues mp = bDefinition.getPropertyValues();
				mp.addPropertyValue("username", "xiaohong!");
			}
		}
	}
	
}
