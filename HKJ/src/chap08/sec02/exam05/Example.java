package chap08.sec02.exam05;

public class Example {
	public static void main(String[] args) {
		ImplementationC imp = new ImplementationC();
		
		InterfaceA ia = imp;
		ia.methodA();
		System.out.println();

		InterfaceB ib = imp;
		ib.methodB();
		System.out.println();

		InterfaceC ic = imp;
		ia.methodA();
		ib.methodB();
		ic.methodC();
		System.out.println();
		
		
	}
}
