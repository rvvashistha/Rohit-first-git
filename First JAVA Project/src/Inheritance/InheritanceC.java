package Inheritance;

public class InheritanceC extends InheritanceB{
	float triangleArea;
	int b;
	int h;
	
	
	void caltriangleArea(int b,int h) {
		triangleArea=(b*h)/2;
		System.out.println("area of the triangle is: "+triangleArea);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		InheritanceC obj=new InheritanceC();
		obj.calcircleArea();
		obj.calrectangleArea();
		obj. caltriangleArea(20,20);
		

	
	}

}
