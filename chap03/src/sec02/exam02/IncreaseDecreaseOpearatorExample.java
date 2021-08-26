package sec02.exam02;

public class IncreaseDecreaseOpearatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;
		System.out.println(x);
		++x;
		System.out.println(x); //12
		
		System.out.println("---------------");
		y--;
		--y;
		System.out.println(y); //8
		
		System.out.println("---------------");
		z = x++;
		System.out.println(z); //13
		System.out.println(x); //12
		
		System.out.println("---------------");
		z = ++x;
		System.out.println(z); //14
		System.out.println(x); //14
		
		
		

	}

}
