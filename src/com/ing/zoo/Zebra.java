package com.ing.zoo;

import com.ing.zoo.Interfaces.Herbivore;

public class Zebra extends Animal implements Herbivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    /**
     * Constructor gives zebra a name
     *
     * @param name name of the zebra
     */
    public Zebra(String name) {
        super(name);
    }

    /**
     * Lets the zebra print a message saying hello
     */
    @Override
    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    /**
     * Lets the zebra eat leaves and print a message
     */
    @Override
    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
