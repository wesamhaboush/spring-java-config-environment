package net.codebreeze;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.codebreeze.config.AppConfig;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.core.env.SimpleCommandLinePropertySource;

public class Starter {
	public static void main( final String[] args ) {
		CommandLinePropertySource clps = new SimpleCommandLinePropertySource(args);
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().getPropertySources().addFirst(clps);
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();
		final SimpleBean bean = context.getBean( SimpleBean.class );
		bean.print();
	}
}
