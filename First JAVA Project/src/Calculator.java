import java.util.Scanner;

public class Calculator {
     int cube (int x) {
		return x*x*x;
	}
      public static void main(String[] args) {
    	  try (Scanner sc = new Scanner(System.in)) {
    		  System.out.println("please enter the number for which you want cube:- ");
			int a=sc.nextInt();
			  int result;
			  Calculator cl=new Calculator();
			  result=cl.cube(a);
			
			 System.out.println("the cube = "+result);
		}
    	 
    	  
    	  
      }

}
