package chap08.sec01.exam03;

public class MyClass {
	
	RemoteControl rc = new Television();
	
	public MyClass() {
	}

	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turn0n();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turn0n();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) { 
		rc.turn0n();
		rc.setVolume(5);
	}

}
