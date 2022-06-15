package Encapsulation1;

public class Execute {
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setcountryName("india");
		obj.setnationalAnthem("jangna man");
		obj.settouristSpot("delhi");
		System.out.println(obj.getcountryName() + "\n" + obj.getnationalAnthem() + " \n" + obj.gettouristSpot());
	}

}
