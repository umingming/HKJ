package sec03.exam05;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println(intValue2);
		System.out.println((char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		int result2 = x / y;
		System.out.println(result);
		System.out.println(result2);
		char c1 = 'a';
		int i1 = c1 + 1;
		char c2 = (char) i1;
		System.out.println(c2);
		
		
	}

}
