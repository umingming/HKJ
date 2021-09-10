package sec02;

public class Check {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		//for문
		int std = max;
		for( int i=0; i<4; i++ ){
		 std = i;
		 if(std > max){     
		  max = std;
		}
		}  
		System.out.println("max: " + max);

	}


}
