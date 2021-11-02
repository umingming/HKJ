package chap11.exam05;

import chap08.sec02.exam01.Car;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Car.class;
//		Class c2 = Class.forName("sec02.exam01.Car");
//		Car car = new Car();
//		Class c3 = car.getClass();
		
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getPackage().getName());

	}

}
