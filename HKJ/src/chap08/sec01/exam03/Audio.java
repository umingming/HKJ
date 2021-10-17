package chap08.sec01.exam03;

public class Audio implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turn0n() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turn0ff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	

}