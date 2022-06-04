
public class DriverEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Employee emp1= new Employee();
		emp1.empId=123;
		emp1.empName="rohit";
		emp1.empAddress="delhi";
		emp1.empFirstName="Rohit";
		emp1.empLastName="Vashistha";
		 
		
		emp1.displayEmpData();
        
		Employee emp2= new Employee();
		emp2.empId=124;
		emp2.empName="rahul";
		emp2.empAddress="delhi";
		emp2.empFirstName="rahul";
		emp2.empLastName="kumar";
		emp2.displayEmpData();
 //System.out.println("hello");
	}

}
