package singleInheritance;

class Parent{
	public void method1()
	{
		System.out.println("method1 returns");
	
	}
}

class ChildA extends Parent{
	 protected void method1() {
		System.out.println("method12 returns");
		
	}
}
public class PublicToProtected {

	public static void main(String[] args) {
		ChildA m2 = new ChildA();
		m2.method1();
//	Cannot reduce the visibility of the inherited method from Parent	
	}

}


