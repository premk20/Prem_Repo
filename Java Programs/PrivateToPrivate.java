package singleInheritance;

class Parent{
	private void method1()
	{
		System.out.println("method1 returns");
	
	}
}

class ChildA extends Parent{
	private void method1() {
		System.out.println("method1 returns");
		
	}
}
public class PrivateToPrivate {

	public static void main(String[] args) {
		ChildA m2 = new ChildA();
		m2.method1();
	
	//The method method1() from the type ChildA is not visible//	
		
	
	}

}
