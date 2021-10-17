package chap08.sec01.exam03;

public class myClass {
	
	RemoteControl rc = new Television();

	public myClass(RemoteControl rc) {
		this.rc = rc;
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
	}
	
	void methodB(RemoteControl rc) { }

}
