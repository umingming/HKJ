package chap10.sec02.exam02;

public class TryCatchFinallyRuntiomeExceptionExample {

	public static void main(String[] args) {
		String date1 = null;
		String date2 = null;
		try {
			date1 = args[0];
			date2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}
		
		try {
			int value1 = Integer.parseInt(date1);
			int value2 = Integer.parseInt(date2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		

	}

}
