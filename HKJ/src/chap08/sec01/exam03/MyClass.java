package chap08.sec01.exam03;

public class MyClass {
	
	RemoteControl rc = new Television();

	public MyClass(RemoteControl rc) {
		this.rc = rc;
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
	}
	
	void methodB(RemoteControl rc) { }

}
