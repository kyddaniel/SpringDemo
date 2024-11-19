package org.springDemo.config;

import org.springDemo.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = {"desktop1", "desktop2"})
    //@Bean <= default name is method name (i.e. desktop)
    public Desktop desktop() {
        return new Desktop();
    };

}
