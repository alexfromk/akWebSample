package ua.ak.sample.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.ak.sample.web.services.ICityService;
import ua.ak.sample.web.services.MockCityService;

@Configuration
public class AppConfig
{

	@Bean(name = "cityService")
	public ICityService cityService()
	{
		return new MockCityService();
	}
	
}
