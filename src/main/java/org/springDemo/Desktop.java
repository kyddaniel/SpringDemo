package org.springDemo;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop created");
    }

    @Override
    public void compile() {
        System.out.println("Compile");
    }
}
