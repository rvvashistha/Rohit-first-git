public class Area {
 long radius;
 final double pi=3.14;
   double totalarea;
void area(int r) {
	radius=r;
	totalarea=pi*radius*radius;
	System.out.println(totalarea);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Area ar=new Area();
	ar.area(231654445);
		
		

	}

}
