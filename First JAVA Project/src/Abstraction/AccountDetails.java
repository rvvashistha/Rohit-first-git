package Abstraction;

public class AccountDetails extends CurrentAccount {
	private int depositAmount;
	int withdrawalAmount;

	AccountDetails(String a, int b, int c, int d, int e) {
		super(a, b, c);
		this.depositAmount = d;
		this.withdrawalAmount = e;

	}

	void display() {
		// super.display();
		System.out.println("Customer name is:" + customerName + '\n' + "customer account no is: " + accountNo + '\n'
				+ "customer current baclance is: " + currentBalance + '\n' + "amount deposited: " + depositAmount + '\n'
				+ "cash withdrawal: " + withdrawalAmount);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails obj = new AccountDetails("rohit kumar vashistha", 121, 1313123, 1313120000, 1231230000);
		obj.display();
	}
}
