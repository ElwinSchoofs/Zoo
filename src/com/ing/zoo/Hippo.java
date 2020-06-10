package com.ing.zoo;

import com.ing.zoo.Interfaces.Herbivore;

public class Hippo extends Animal implements Herbivore {
    /**
     * Constructor gives hippo a name
     *
     * @param name name of the hippo
     */
    public Hippo(String name) {
        super(name);
    }

    /**
     * Lets the hippo print a message saying hello
     */
    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    /**
     * Lets the hippo eat leaves and print a message
     */
    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
