package org.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Alien alien1 = (Alien) context.getBean("alien"); // returns Object, need to do type cast
        Alien alien1 = context.getBean("alien", Alien.class); // can specify type
        alien1.code();

        Alien alien2 = (Alien) context.getBean("alien");
        //System.out.println(alien2.age);

        Computer computer = context.getBean(Computer.class); // find bean by type
        Desktop desktop = context.getBean(Desktop.class); // find bean by type
    }
}