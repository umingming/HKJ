package sec02.exam11;

import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while(run) {
		 System.out.println("--------------------------");
		 System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		 System.out.println("--------------------------");
		 System.out.print("����> ");
		 int num = Integer.parseInt(scanner.nextLine());
		 if(num==1) {
			 System.out.print("���ݾ�> ");
			 balance += Integer.parseInt(scanner.nextLine());
		 } else if(num==2) {
			 System.out.print("��ݾ�> ");
			 balance -= Integer.parseInt(scanner.nextLine());
		 } else if(num==3) {
			 System.out.println("�ܰ�> "+balance); 
		 } else {
			 break;
		 }
		 System.out.println();
		}
		System.out.println("���α׷� ����");

		
	}
}