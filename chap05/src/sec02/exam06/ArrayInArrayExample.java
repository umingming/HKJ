package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) { //2
			for(int k=0; k<mathScores[i].length; k++) { //3, 3
				System.out.println("mathScores["+i+"]"
						+ "["+k+"]="+mathScores[i][k]);
		
			}//[0][0]=0, [0][1]=0, [0][2]=0, [1][0]=0, [1][1]=0, [1][2]=0
			
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) { //2
			for(int k=0; k<englishScores[i].length; k++) { //2, 3
				System.out.println("englishScores["+i+"]"
						+ "["+k+"]="+englishScores[i][k]);
		
			}//[0][0]=0, [0][1]=0, [1][0]=0, [1][1]=0, [1][2]=0
			
		}
		System.out.println();
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		for(int i=0; i<javaScores.length; i++) { //2
			for(int k=0; k<javaScores[i].length; k++) { //2, 3
				System.out.println("javaScores["+i+"]"
						+ "["+k+"]="+javaScores[i][k]);
		
			}//[0][0]=95, [0][1]=80, [1][0]=92, [1][1]=96, [1][2]=80
		}
	}

}
