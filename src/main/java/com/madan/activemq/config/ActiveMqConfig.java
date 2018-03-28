package com.madan.activemq.config;

import javax.jms.Queue;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class ActiveMqConfig {
	
	@Value("${activemq.broker-url}")
	private String brokerUrl;
	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("madan-activemq-queue");
	}

	@Bean
	public ActiveMQConnectionFactory activemQConnectionFactory() {
		ActiveMQConnectionFactory connectionFactory= new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(brokerUrl);
		return connectionFactory;
	}
	
	@Bean
	public JmsTemplate jmsTemplate() {
		return new JmsTemplate(activemQConnectionFactory());
	}
}
