package Encapsulation1;


public class EncapsulationImpl {
	private int age;
	private boolean decision;
	
 public int getage() {
	 return age;
 }
 public void setage(int age) {
	 this.age=age;
 }
 public boolean getdecision() {
	 return decision;
 }
 public void setdecision(boolean decision) {
	 this.decision=decision;
 }
 
 public static void main(String []args) {
	

	 EncapsulationImpl obj=new EncapsulationImpl();
	 obj.setage(70);
	 
	 if(obj.getage()<=60) {
		 obj.setdecision(true);
		 System.out.println("The age of the candidateis "+obj.getage());
		 System.out.println("Driving license can be issuedto the candidate."+obj.getdecision());
		 
	 }
	 else {
		 obj.setdecision(false);
		 System.out.println("Driving licence cannot issue to the candidate");
	 }
	 
	 
 }
 
}
