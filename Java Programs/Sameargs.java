package singleInheritance;

class Parent{
	public void method1(int a, int b)
	{
		System.out.println("sum of two is" +(a+b));
	}
}

class ChildA extends Parent{
	public void method1(int a, int b) {
		System.out.println("substraction of two is" +(a-b));
	}
}
public class Sameargs {

	public static void main(String[] args) {
		Parent m2 = new Parent();
		m2.method1(10, 20);
		ChildA m1 = new ChildA();
		m1.method1(10, 20);
		
		
	}

}
