package chap09.sec01.exam05;

public class Outer {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Nested nested = outer.new Nested();
		nested.print(); //nested, outer
	}
	 String field = "Outter-field";
	 void method() {
		 System.out.println("Outter-method");
	 }
	 
	 class Nested{
		 String field = "Nested-field";
		 void method() {
			 System.out.println("Nested-method");
		 }
		 
		 void print() {
			 System.out.println(this.field);
			 this.method();
			 System.out.println(Outer.this.field);
			 Outer.this.method();
		 }
	 }
	 
}
