package org.springDemo;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;

    public Alien() {
        //this.age = 0;
        //System.out.println("object created");
    }

    /*@ConstructorProperties({"age", "lap"}) // referring to the constructor injection in the XML file
    public Alien(int age, Laptop lap) {
        this.age = age;
        this.laptop = lap;
        System.out.println("para constructor called");
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("Setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        //System.out.println("Coding");
        com.compile();
    }
}
