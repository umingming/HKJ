package chap09.sec01.exam04;

public class Outter {

		public void method1(int arg) {
			final int localVariable = 1;
			arg = 100;
			class Ineer {
				public void method() {
					int result = arg + localVariable;
				}
			
			}		

		}

}
