
public class Calculator {
     int cube (int x) {
		return x*x*x;
	}
      public static void main(String[] args) {
    	  int result;
    	  Calculator cl=new Calculator();
    	  result=cl.cube(10);
    	
    	 System.out.println("the cube = "+result);
    	 
    	  
    	  
      }

}
