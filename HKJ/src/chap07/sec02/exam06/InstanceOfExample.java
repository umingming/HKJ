package chap07.sec02.exam06;

public class InstanceOfExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환하지 않음"); //이거
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA); //성공들
		
		Parent parentB = new Parent();
		method1(parentB);  //실패
		method2(parentB); //에러
		
		
	}

}
