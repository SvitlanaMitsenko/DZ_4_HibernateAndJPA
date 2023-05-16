package org.example.Task7;

import org.example.Task7.Entity.Animal;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AnimalHelper ah = new AnimalHelper();
        ah.addAnimal(new Animal("Jack", 4, true  ));

        List<Animal> list = ah.getAnimalList();
        list.forEach(item-> System.out.println(item));

        System.out.println(ah.getAnimalById(2));
        ah.removeAnimal(3);

        list = ah.getAnimalList();
        list.forEach(item-> System.out.println(item));

    }
}