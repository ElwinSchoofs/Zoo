package com.ing.zoo;

/**
 * This class serves as a abstract class for all animals.
 *
 * @author Elwin
 */
public abstract class Animal {
    //I left the attributes public because the assignment was given this way. Normally I would make it private
    //and use getters and setters.
    public String name;
    public String helloText;
    public String eatText;

    /**
     * Constructor gives animal a name
     *
     * @param name name of the animal
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Lets the animal print a message saying hello
     */
    abstract public void sayHello();
}
