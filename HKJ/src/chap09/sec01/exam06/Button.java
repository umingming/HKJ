package chap09.sec01.exam06;

public class Button {

	OnClickListener listener;
	
	void setOnVlickListenr(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}

	static interface OnClickListener{
		void onClick();
	}
}
