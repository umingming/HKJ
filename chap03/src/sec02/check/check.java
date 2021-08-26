package sec02.check;

import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		double num1 = Double.parseDouble(scan.nextLine());
		System.out.print("두 번째 수: ");
		double num2 = Double.parseDouble(scan.nextLine());
		System.out.println("--------");
		System.out.print(((num2 == 0)||(num2 == 0.0)) ? ("결과: " + "무한대") : ("결과: " + num1 /num2));

	}

}
