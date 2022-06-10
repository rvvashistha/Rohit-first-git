package JustPractice;

public class MethodImpl {
	public String s=null;
	public void Withargs() {
		System.out.println("I am from method without return type");
	}
	public void Withargs(String s) {
		this.s=s;
		System.out.println(s);
	}
	public String Withargs1() {
		s="iam the return type";
		return s;
	}
	public String Withargs2(String s) {
		this.s=s;
		return s;
	}
	public static void main(String []args) {
		
		MethodImpl obj=new MethodImpl();
	    obj.Withargs();  

	   obj.Withargs("I am from method without return type and an input argument");  
	    
	   System.out.println(obj.Withargs1());
		
		obj.Withargs2(" am from methodwith return type and aninput argument");
		
		
	}
	
	
	
}
