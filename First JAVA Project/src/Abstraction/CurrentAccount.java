package Abstraction;

 public class CurrentAccount extends Account {
	 int currentBalance;
	 
	CurrentAccount(String a, int b,int c) {
		super(a, b);
		c=currentBalance;
		
	}
	void display() {
		super.display();
		System.out.println("Customer name is:"+customerName+"customer account no is: "+accountNo+"customer current baclance is: "+currentBalance);
	}

}
