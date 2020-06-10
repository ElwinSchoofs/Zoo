package com.ing.zoo;

import com.ing.zoo.Interfaces.Herbivore;

/**
 * This class used for zebras. They have a name, can say hello and eat leaves.
 *
 * @author ING, Elwin Schoofs
 */
public class Zebra extends Animal implements Herbivore {

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
