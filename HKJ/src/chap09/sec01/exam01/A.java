package chap09.sec01.exam01;

 class A {
	A(){ System.out.println("A 객체가 생성됨.");}
	
	class B {
		B() {System.out.println("B 객체가 생성됨.");}
		int field1;
		void method1() {}
	}
	
	static class C {
		C(){System.out.println("C 객체가 생성됨.");}
		int filed1;
		static int filed2;
		void method1() {}
		static void method2() {}
	}
		
	void method() {
		class D{
			D(){System.out.println("D객체가 생성됨.");}
			int field1;
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	}
