package singleInheritance;

class Parent{
	static void method1()
	{
		System.out.println("method1 returns");
	
	}
}

class ChildA extends Parent{
	static void method1() {
		System.out.println("method12 returns");
		
	}
}
public class StaticToStatic {

	public static void main(String[] args) {
		ChildA m2 = new ChildA();
		m2.method1();
	
		
	}

}


