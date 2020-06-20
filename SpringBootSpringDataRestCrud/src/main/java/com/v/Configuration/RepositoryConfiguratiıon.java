package com.v.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.v.Domain.Student;
//idlerinin gelmesinin sagladik bu config ile
@Configuration
public class RepositoryConfiguratiıon implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Student.class); 
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config);
	}

}
