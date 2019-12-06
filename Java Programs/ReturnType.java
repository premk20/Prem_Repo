package singleInheritance;

class Parent{
	public int method1(int a )
	{
		System.out.println("method1 returns" +a);
		return a;
	}
}

class ChildA extends Parent{
	public int method1(int a) {
		System.out.println("method1 returns" +a);
		return a;
	}
}
public class ReturnType {

	public static void main(String[] args) {
		Parent m2 = new Parent();
		m2.method1(10);
		ChildA m1 = new ChildA();
		m1.method1(20);
		
		
	}

}