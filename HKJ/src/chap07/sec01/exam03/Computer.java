package chap07.sec01.exam03;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computoer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
