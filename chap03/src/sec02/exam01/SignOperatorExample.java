package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;     //-100 
		int result2 = -x;     //100

		System.out.println(result1);
		System.out.println(result2);
		
		byte y = -100;
		//byte result = -y;    //컴파일에러
		int result = -y;     //100
		System.out.println(result);

	}

}
