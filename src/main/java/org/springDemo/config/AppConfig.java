package org.springDemo.config;

import org.springDemo.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = {"desktop1", "desktop2"})
    //@Bean <= default name is method name (i.e. desktop)
    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    };

}
