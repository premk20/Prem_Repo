package singleInheritance;

class Parent{
	protected void method1()
	{
		System.out.println("method1 returns");
	
	}
}

class ChildA extends Parent{
	 public void method1() {
		System.out.println("method12 returns");
		
	}
}
public class ProtectedToPublic {

	public static void main(String[] args) {
		ChildA m2 = new ChildA();
		m2.method1();
		
	}

}


