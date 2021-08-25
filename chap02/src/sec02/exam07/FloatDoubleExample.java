package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		float var1 = 3.14f;
		float var2 = 0.12345678901234567890f;
		double var3 = 0.12345678901234567890;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		
		double var4 = 3e6;
		double var5 = 3e-3;
		float var6 = 3e6f;
		float bar = 1e2f;
		System.out.println(bar);
		
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		
		long longValue = 5000000000L;
		float floatValue = longValue;
		double doubleValue = longValue;
		System.out.println(floatValue);
		System.out.println(doubleValue);
		
		
		
	

	}

}
