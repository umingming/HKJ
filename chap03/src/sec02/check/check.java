package sec02.check;

import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ��: ");
		double num1 = Double.parseDouble(scan.nextLine());
		System.out.print("�� ��° ��: ");
		double num2 = Double.parseDouble(scan.nextLine());
		System.out.println("--------");
		System.out.print(((num2 == 0)||(num2 == 0.0)) ? ("���: " + "���Ѵ�") : ("���: " + num1 /num2));

	}

}
