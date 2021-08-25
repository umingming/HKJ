package sec04.exam01;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);    //123원(줄바꿈)
		System.out.printf("상품의 가격:%6d원\n", value);   //___123원(줄바꿈)
		System.out.printf("상품의 가격:%-6d원\n", value);  //123___원(줄바꿈)
		System.out.printf("상품의 가격:%06d원\n", value);  //000123원(줄바꿈)
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		//반지름이 10인 원의 넓이:______3.14(줄 바꿈)
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d: %-10s: %10s\n", 1, name, job);
		//_____1: 홍길동________: 도적________(줄 바꿈)

	}

}
