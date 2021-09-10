package sec02;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			 System.out.println("-----------------------------------------------------------");
			 System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			 System.out.println("-----------------------------------------------------------");
			 System.out.print("선택> ");
			 
			 int selectNo = Integer.parseInt(scanner.nextLine());

			 if(selectNo == 1) {
				 System.out.print("학생수> ");
				 int studentNo = Integer.parseInt(scanner.nextLine());
				 System.out.println();
				 
			 }else if(selectNo == 2) {
				 scores = new int[3];
				 System.out.print("scores[0]>");
				 scores[0] = Integer.parseInt(scanner.nextLine());
				 System.out.print("scores[1]>");
				 scores[1] = Integer.parseInt(scanner.nextLine());
				 System.out.print("scores[2]>");
				 scores[2] = Integer.parseInt(scanner.nextLine());
			 }else if(selectNo == 3) {
				 System.out.println("scores[0]>" + scores[0]);
				 System.out.println("scores[1]>" + scores[1]);
				 System.out.println("scores[2]>" + scores[2]);

			 }else if(selectNo == 4) {
				 int maxScore;
				 if(scores[0]>scores[1]){
				  if(scores[0]>scores[2]){
				   maxScore = scores[0];
				  } else { 
				   maxScore = scores[2];
				  } 
				 } else {
				  if(scores[1]<scores[2]){
				   maxScore = scores[2];
				  }else{
				   maxScore = scores[1];
				  } 
				 int sum = 0;
				 for( int score : scores ) {
				   sum += score;
				 }
				 double avgScore = (double)sum / studentNum; 
				 System.out.print("최고 점수: " + maxScore );
				 System.out.print("평균 점수: " + avgScore );
				 System.out.print("합계: " + sum );

				 }
			 }else if(selectNo == 5) {
					  System.out.print("프로그램 종료");
				 }
			 

		}
	}
}
