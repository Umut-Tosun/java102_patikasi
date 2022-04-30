package ObjectOrientedProgramming.Polymorphism;

import java.io.Console;

public class Main {
    public static void talk(Animal animal){
        System.out.println(animal.talk());
    }
    public static void talk(Object object) {

        if (object instanceof Dog) {
            Dog dogTest = (Dog) object;
            System.out.println(dogTest.talk());

        } else if (object instanceof Cat) {
            Cat catTest = (Cat) object;
            System.out.println(catTest.talk());

        } else if (object instanceof Horse) {
            Horse horseTest = (Horse) object;
            System.out.println(horseTest.talk());

        } else if (object instanceof Animal) {
            Animal animalTest = (Animal) object;
            System.out.println(animalTest.talk());
        }
    }
    public static void main(String[] args) {
       /*
        // İlk Gösterim
        Animal animal = new Animal("Hiper");
        System.out.println(animal.talk());

        Animal animal1 = new Cat("Nazar");
        System.out.println(animal1.talk());

        Animal animal2 = new Dog("Kangal");
        System.out.println(animal2.talk());

        Animal animal3 = new Horse("Bold-Onor");
        System.out.println(animal3.talk());

        //Fonksiyon kullanarak gösterim

        talk(new Cat("Nasip"));
        talk(new Dog("Karabaş"));
        talk(new Horse("Bold-Pilot")); */

        // Temel Gösterim

        Cat kedi = new Cat("Nasip");

        if (kedi instanceof Cat){
            System.out.println("Bu nesne Kedi sınıfından");
        }

        if (kedi instanceof Animal){
            System.out.println("Bu nesne Hayvan sınıfından");
        }

        //Fonksiyon ile gösterim

        Cat cat = new Cat("Nasip");
        Dog dog = new Dog("Zizu");
        Horse horse = new Horse("BoldPilot");
        Animal animal = new Animal("Turunç");

        talk(cat);
        talk(dog);
        talk(horse);
        talk(animal);


    }
}
