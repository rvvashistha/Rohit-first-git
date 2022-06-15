package Abstraction;

public class Account {
	String customerName;
	int accountNo;

	Account(String a, int b) {
		this.customerName = a;
		this.accountNo = b;

	}

	void display() {
		System.out.println("Customer name is:" + customerName + "customer account no is: " + accountNo);
	}
}
