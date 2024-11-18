package org.springDemo;

public class Alien {

    private int age;
    private Laptop laptop;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Alien() {
        this.age = 0;
        System.out.println("object created");
    }

    public void code() {
        System.out.println("Coding");
        laptop.compile();
    }
}
