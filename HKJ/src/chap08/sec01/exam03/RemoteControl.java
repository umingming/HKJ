package chap08.sec01.exam03;

public interface RemoteControl {
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	public void turn0n();
	public void turn0ff();
	public void setVolume(int volume);

}
