package sec02.exam11;

public class check {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++){
			for(int j=0; j<=3; j++){
				if(j+i<4) {
					System.out.print(" ");
				}else{
					break;
					}
				}
			for(int k=1; k<=4; k++) {
				System.out.print("*");
				if(i==k) {
					System.out.println();
					break;
				}
			}
		}

	}
}