package singleInheritance;

 class Shape{
	int length;
	int breadth;
	int area;

	}
	
 class rectangle extends Shape
 {
	 public void area() {
		 length = 20;
		 breadth =10;
		 
			 area = length * breadth;
		
		System.out.println("area is"+area);
	 }
 }
	 
	 class square extends rectangle
	 {
		 public void area( double length1,int breadth1) {
			 double area=length1* breadth1;
			 System.out.println("area is "+area);
		 }
	 }	
	
public class Multi  {

	public static void main(String[] args) 
	{
		square s = new square();
		s.area(10,10);
		s.area();
		
		

	}

}
