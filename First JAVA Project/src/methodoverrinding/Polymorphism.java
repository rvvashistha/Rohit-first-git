package methodoverrinding;

public class Polymorphism {
	int ar;
 void findArea(int l,int b) {
		ar=l*b;
		System.out.println("area of rectangle is: "+ar);
	}
 int ar2;
	void findArea(int l,int b,int h) {
		ar2=l*b*h;
		System.out.println("area of rectangular cuboid is: "+ar2);
		}
}

