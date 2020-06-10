package com.ing.zoo;

import com.ing.zoo.Interfaces.Herbivore;
import com.ing.zoo.Interfaces.Trickster;

import java.util.Random;

/**
 * This class is used for deers. They have a name, can say hello, eat leaves and perform tricks.
 *
 * @author Elwin Schoofs
 */
public class Deer extends Animal implements Herbivore, Trickster {
    //I left the attributes public because the assignment was given this way. Normally I would make it private
    //and use getters and setters.
    public String trick;

    /**
     * Constructor gives deer a name
     *
     * @param name name of the deer
     */
    public Deer(String name) {
        super(name);
    }

    /**
     * Lets the deer print a message saying hello
     */
    @Override
    public void sayHello() {
        helloText = "Deer! Deer! Deer!";
        System.out.println(helloText);
    }

    /**
     * Lets the deer eat leaves and print a message
     */
    @Override
    public void eatLeaves() {
        eatText = "NOM NOM NOM";
        System.out.println(eatText);
    }

    /**
     * Lets the deer perform a trick and prints out a message.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        switch (rnd) {
            case 0:
                trick = "bumps into a tree";
                break;
            case 1:
                trick = "kicks human";
                break;
        }
        System.out.println(trick);
    }
}
