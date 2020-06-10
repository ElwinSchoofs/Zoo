package com.ing.zoo;

import com.ing.zoo.Interfaces.Herbivore;
import com.ing.zoo.Interfaces.Trickster;

import java.util.Random;

public class Deer extends Animal implements Herbivore, Trickster {
    public String name;
    public String helloText;
    public String eatText;
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
