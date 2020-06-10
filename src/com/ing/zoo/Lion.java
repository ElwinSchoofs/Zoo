package com.ing.zoo;

import com.ing.zoo.Interfaces.Carnivore;

/**
 * This class is used for Lions. They have a name, can say hello and eat meat.
 *
 * @author ING, Elwin Schoofs
 */
public class Lion extends Animal implements Carnivore {
    /**
     * Constructor gives lion a name
     *
     * @param name name of the lion
     */
    public Lion(String name) {
        super(name);
    }

    /**
     * Lets the lion print a message saying hello
     */
    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    /**
     * Lets the lion eat meat and print a message
     */
    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
