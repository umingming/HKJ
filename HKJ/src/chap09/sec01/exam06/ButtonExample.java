package chap09.sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnVlickListenr(new CallListener());
		btn.touch();
		btn.setOnVlickListenr(new MessageListener());
		btn.touch();
		System.out.println();

	}

}
