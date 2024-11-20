package org.springDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype") // change the scope of the bean
public class Laptop implements Computer {

    public Laptop() {
        System.out.println("Laptop created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using laptop");
    }
}
