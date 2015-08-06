package net.codebreeze;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SimpleBean {

    @Autowired
    private Environment environment;

	@Value("${db.user.name}")
	private String dbUserName;

    @Value("${idea.launcher.port}")
    private int ideaLauncherPort;

    @Value("${COMPIZ_CONFIG_PROFILE}")
    private String compizConfigProfile;

    @Value("${argument-test:defaultValue}")
    private String argumentTest;

	public void print() {
        System.out.println(ReflectionToStringBuilder.toString(this));
    }
}
