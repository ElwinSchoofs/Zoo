package com.ing.zoo;

import com.ing.zoo.Interfaces.Carnivore;
import com.ing.zoo.Interfaces.Trickster;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, Trickster {
    public String name;
    public String helloText;
    public String eatText;
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
