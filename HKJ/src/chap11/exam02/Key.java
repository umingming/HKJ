package chap11.exam02;

public class Key {
	public int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return number;
	}
	

}
