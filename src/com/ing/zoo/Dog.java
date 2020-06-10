package com.ing.zoo;

import com.ing.zoo.Interfaces.Carnivore;
import com.ing.zoo.Interfaces.Herbivore;
import com.ing.zoo.Interfaces.Trickster;

import java.util.Random;

public class Dog extends Animal implements Carnivore, Herbivore, Trickster {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    /**
     * Constructor gives dog a name
     *
     * @param name name of the dog
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Lets the dog print a message saying hello
     */
    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    /**
     * Lets the dog eat leaves and print a message
     */
    @Override
    public void eatLeaves() {
        eatText = "woof munch woof munch";
        System.out.println(eatText);
    }

    /**
     * Lets the dog eat meat and print a message
     */
    @Override
    public void eatMeat() {
        eatText = "grrrrr yummy";
        System.out.println(eatText);
    }

    /**
     * Lets the dog perform a trick and prints out a message.
     */
    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(3);
        switch (rnd) {
            case 0:
                trick = "sit";
                break;
            case 1:
                trick = "pretends to be dead";
                break;
            case 2:
                trick = "do a barrel roll";
                break;
        }
        System.out.println(trick);
    }
}
