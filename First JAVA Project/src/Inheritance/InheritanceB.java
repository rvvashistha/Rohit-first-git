package Inheritance;

public class InheritanceB extends InheritanceA {
	float rectangleArea;
	int l;
	int b;
	
	
	void calrectangleArea() {
		rectangleArea=l*b;
		System.out.println("area of the rectangle is: "+rectangleArea);
	}
}
