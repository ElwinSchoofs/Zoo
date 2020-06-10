package com.ing.zoo;

import com.ing.zoo.Interfaces.Carnivore;
import com.ing.zoo.Interfaces.Herbivore;
import com.ing.zoo.Interfaces.Trickster;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        //I placed all animals in a ArrayList so I can go traverse through all the animals
        ArrayList<Animal> animals = new ArrayList<>();
        Lion henk = new Lion("henk");
        animals.add(henk);
        Hippo elsa = new Hippo("elsa");
        animals.add(elsa);
        Pig dora = new Pig("dora");
        animals.add(dora);
        Tiger wally = new Tiger("wally");
        animals.add(wally);
        Zebra marty = new Zebra("marty");
        animals.add(marty);
        Deer holly = new Deer("holly");
        animals.add(holly);
        Dog peepo = new Dog("peepo");
        animals.add(peepo);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        //I used else if statements instead of switch cases because it already was used this way in the start project
        String input = scanner.nextLine();
        //checks if the command is hello
        if (input.equals(commands[0])) {
            for (Animal animal : animals) {
                animal.sayHello();
            }
        }
        //Checks if there is written something behind hello
        else if (input.length() > 5 && input.substring(0, 6).equals(commands[0] + " ")) {
            String name = input.substring(6);
            for (Animal animal : animals) {
                if (animal.name.equals(name))
                    animal.sayHello();
            }
        }
        //checks if the command is give leaves
        else if (input.equals(commands[1])) {
            for (Animal animal : animals) {
                if (animal instanceof Herbivore)
                    ((Herbivore) animal).eatLeaves();
            }
        }
        //checks if the command is give meat
        else if (input.equals(commands[2])) {
            for (Animal animal : animals) {
                if (animal instanceof Carnivore)
                    ((Carnivore) animal).eatMeat();
            }
        }
        //checks if the command is perform trick
        else if (input.equals(commands[3])) {
            for (Animal animal : animals) {
                if (animal instanceof Trickster)
                    ((Trickster) animal).performTrick();
            }
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
