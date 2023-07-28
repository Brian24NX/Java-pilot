package com.Brian;

/**
 * @author nxzhouj
 */
public class AnimalTest {
    public static void main(String[] args) {
        Tiger myTiger = new Tiger("carnivore","Brian", 24);
        myTiger.eat();
        myTiger.sleep();
        myTiger.introduction();
        myTiger.aaa();

        // create an object of the outer class Animal
        Animal myAnimal1 = new Animal("carnivore", "Tiger", 24);
        // create an object of inner class using the outer class
        Animal.AnimalAction animalAction1 = myAnimal1.new AnimalAction();
        animalAction1.setActionType();
        System.out.println("The action characteristic for carnivore is " + animalAction1.getActionType() );

        Animal myAnimal2 = new Animal("herbivore", "Rabbit", 23);
        Animal.AnimalAction animalAction2 = myAnimal2.new AnimalAction();
        animalAction2.setActionType();
        System.out.println("The action characteristic for herbivore is " + animalAction2.getActionType());
    }
}
