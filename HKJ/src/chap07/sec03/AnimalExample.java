package chap07.sec03;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Animal animal = null;
		animal = new Dog();
		animal.sound(); //멍멍
		
		animalSound(new Dog()); //멍멍
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
