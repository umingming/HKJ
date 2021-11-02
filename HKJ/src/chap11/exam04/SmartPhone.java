package chap11.exam04;

public class SmartPhone {

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone("구글", "안드로이드");
		
		String strObj = s.toString();
		System.out.println(strObj);
		
		System.out.println(s);

	}
	
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}
	
	
	
}
