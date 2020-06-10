package com.ing.zoo;

import com.ing.zoo.Interfaces.Carnivore;
import com.ing.zoo.Interfaces.Trickster;

import java.util.Random;

/**
 * This class used for tigers. They have a name, can say hello, eat meat and perform tricks.
 *
 * @author ING, Elwin Schoofs
 */
public class Tiger extends Animal implements Carnivore, Trickster {
    //I left the attributes public because the assignment was given this way. Normally I would make it private
    //and use getters and setters.
    public String trick;

    /**
     * Constructor gives tiger a name
     *
     * @param name name of the tiger
     */
    public Tiger(String name) {
        super(name);
    }

    /**
     * Lets the tiger print a message saying hello
     */
    @Override
    public void sayHello() {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    /**
     * Lets the tiger eat meat and print a message
     */
    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    /**
     * Lets the tiger perform a trick and prints out a message.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        switch (rnd) {
            case 0:
                trick = "jumps in tree";
                break;
            case 1:
                trick = "scratches ears";
                break;
        }

        System.out.println(trick);
    }
}
