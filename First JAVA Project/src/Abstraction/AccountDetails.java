package Abstraction;

public class AccountDetails extends CurrentAccount {
	int depositAmount;
	int withdrawalAmount;
	AccountDetails(String a, int b, int c,int d,int e) {
	    super(a, b, c);
		d=depositAmount;
		e=withdrawalAmount;

	}
	void display() {
		//super.display();
		System.out.println("Customer name is:"+customerName+'\n'+"customer account no is: "+accountNo+'\n'+"customer current baclance is: "+currentBalance+'\n'+"amount deposited: "+depositAmount+'\n'+"cash withdrawal: "+withdrawalAmount);

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails obj=new AccountDetails("rohit kumar vashistha",121,1313123,131312,123123);
		obj.display();
}
}
