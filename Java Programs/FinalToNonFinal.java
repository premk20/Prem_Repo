package singleInheritance;

class Parent{
	final void method1()
	{
		System.out.println("method1 returns");
	
	}
}

class ChildA extends Parent{
	 void method1() {
		System.out.println("method12 returns");
		
	}
}
public class FinalToNonFinal {

	public static void main(String[] args) {
		ChildA m2 = new ChildA();
		m2.method1();
//	java.lang.VerifyError: class singleInheritance.ChildA overrides final method method1.
		
	}

}


