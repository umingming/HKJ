package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '°¡';
		intValue = charValue;
		System.out.println(intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println(longValue);
		
		longValue = 100;
		float floatValue = longValue; 
		System.out.println(floatValue);
		
		floatValue = 100.5f;
	    double doubleValue = floatValue;
		System.out.println(doubleValue);
		
		int intValue2 = 10;
		byte byteValue2 = (byte) intValue2;
		System.out.println(byteValue2);
		
		int intValue3 = 65;
		char charValue3 = (char) intValue3;
		System.out.println(charValue3);
		
		
		
	}

}
