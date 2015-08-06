package net.codebreeze.config;

import net.codebreeze.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(value = "net.codebreeze")
@PropertySource(value = "classpath:conf.properties")
public class AppConfig {
	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBean();
	}

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
