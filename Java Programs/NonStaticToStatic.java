package singleInheritance;

class Parent{
	 void method1()
	{
		System.out.println("method1 returns");
	
	}
}

class ChildA extends Parent{
	static void method1() {
		System.out.println("method1 returns");
		
	}
}
public class NonStaticToStatic {

	public static void main(String[] args) {
		ChildA m1 = new ChildA();
		m1.method1();
		
		
	}

}
