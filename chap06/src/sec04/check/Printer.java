package sec04.check;

public class Printer {
	
//	설계>
//	1. println() 메소드 생성
//		>매개변수의 타입을 int, boolean, double, String 으로 오버로딩
//		>매개값을 출력
	
	void println(int i) {
		System.out.println(i);
	}
	
	void println(boolean b) {
		System.out.println(b);
	}
	void println(double d) {
		System.out.println(d);
	}
	void println(String s) {
		System.out.println(s);
	}

}
