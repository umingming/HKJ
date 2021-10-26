package chap09.sex02.exam03;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listenr) {
		this.listener = listenr;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}

}
