package com.oviana.contacts.conf;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // clase tiene metodos anotados con @Bean
public class DozerMapper {

	@Bean // el valor retornado quedara disponible como bean
	public Mapper beanMapper() {
		return new DozerBeanMapper();
	}
}
