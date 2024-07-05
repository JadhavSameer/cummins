package com;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound();		
		Dog dog = new Dog();
		dog.makeSound();
		Cat cat = new Cat();
		cat.makeSound();

		//Exception at runtime
//		Dog dog1 = (Dog) new Animal();
//		dog1.makeSound();

		Animal animal1 = new Dog();
		animal1.makeSound();
		Animal animal2 = new Cat();
		animal2.makeSound();
		
	}
}
