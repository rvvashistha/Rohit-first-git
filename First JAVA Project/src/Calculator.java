import java.util.Scanner;

public class Calculator {
     int cube (int x) {
		return x*x*x;
	}
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  int a=sc.nextInt();
    	  int result;
    	  Calculator cl=new Calculator();
    	  result=cl.cube(a);
    	
    	 System.out.println("the cube = "+result);
    	 
    	  
    	  
      }

}
