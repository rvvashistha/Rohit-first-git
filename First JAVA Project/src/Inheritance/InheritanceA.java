package Inheritance;

public class InheritanceA {
	float circleArea;
	int r;
	float pi=3.14f;
	
	void calcircleArea() {
		circleArea=pi*r*r;
		System.out.println("area of the circle is: "+circleArea);
	}
}
