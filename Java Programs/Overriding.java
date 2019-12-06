package singleInheritance;

class Parent{
	public void method1()
	{
		System.out.println("this is a parent method");
	}
}

class ChildA extends Parent{
	public void method1() {
		System.out.println("this is child class method");
	}
}
public class Overriding {

	public static void main(String[] args) {
		ChildA m1 = new ChildA();
		m1.method1();
	}

}
