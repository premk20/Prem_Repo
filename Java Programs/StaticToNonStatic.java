package singleInheritance;

class Parent{
	static void method1()
	{
		System.out.println("method1 returns");
	
	}
}

class ChildA extends Parent{
	void method1() {
		System.out.println("method1 returns");
		
	}
}
public class StaticToNonStatic {

	public static void main(String[] args) {
		ChildA m1 = new ChildA();
		m1.method1();
		
		
	}

}
//  Unresolved compilation problem