package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 =  c2 + 1;
		System.out.println(c1);
		System.out.println(c2);
		int c = c2 + 1;
		char c3 = (char) c;
		System.out.println(c3);
	}

}
