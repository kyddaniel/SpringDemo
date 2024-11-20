package org.springDemo.config;

import org.springDemo.Alien;
import org.springDemo.Computer;
import org.springDemo.Desktop;
import org.springDemo.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.springDemo")
public class AppConfig {

    /*@Bean(name = {"desktop1", "desktop2"})
    @Primary // will be selected at first if multiple implementation of an interface exist
    //@Bean <= default name is method name (i.e. desktop)
    //@Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    public Alien alien(@Qualifier("desktop1") Computer com) {
        Alien obj = new Alien();
        obj.setAge(21);
        obj.setCom(com);
        return obj;
    }

    @Bean
    public Laptop laptop() {
        return new Laptop();
    }*/

}
