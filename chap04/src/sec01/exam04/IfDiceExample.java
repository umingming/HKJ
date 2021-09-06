package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*10)+1;

		if(num<7) {
			System.out.println(num);
		} else {
			System.out.println(num-4);
		}
		
		
	}

}
