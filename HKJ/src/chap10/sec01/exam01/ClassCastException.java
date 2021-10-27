package chap10.sec01.exam01;

public class ClassCastException {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}

	private static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

