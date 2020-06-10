package com.ing.zoo;

import com.ing.zoo.Interfaces.Carnivore;
import com.ing.zoo.Interfaces.Herbivore;
import com.ing.zoo.Interfaces.Trickster;

import java.util.Random;

/**
 * This class is used for pigs. They have a name, can say hello, eat leaves, eat meat and perform tricks.
 *
 * @author ING, Elwin Schoofs
 */
public class Pig extends Animal implements Herbivore, Carnivore, Trickster {
    //I left the attributes public because the assignment was given this way. Normally I would make it private
    //and use getters and setters.
    public String trick;

    /**
     * Constructor gives pig a name
     *
     * @param name name of the pig
     */
    public Pig(String name) {
        super(name);
    }

    /**
     * Lets the pig print a message saying hello
     */
    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    /**
     * Lets the pig eat leaves and print a message
     */
    @Override
    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    /**
     * Lets the pig eat meat and print a message
     */
    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    /**
     * Lets the pig perform a trick and prints out a message.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        switch (rnd) {
            case 0:
                trick = "rolls in the mud";
                break;
            case 1:
                trick = "runs in circles";
                break;
        }
        System.out.println(trick);
    }
}
