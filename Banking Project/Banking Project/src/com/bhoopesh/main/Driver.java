package com.bhoopesh.main;

import java.util.Scanner;

import com.bhoopesh.model.Customer;
import com.bhoopesh.service.Banking;

public class Driver {

	public static void main(String[] args) {

		Banking banking = new Banking();
		Customer  customer1 = new Customer("123456", "password");
		
		Scanner sc = new Scanner(System.in);
		
		String bankAccNo, password;
		
		System.out.println("Welcome to login page");
		System.out.println();
		
		System.out.println("enter the bank acc no");
		bankAccNo = sc.nextLine();
		System.out.println("enter the password");
		password = sc.nextLine();
		
		
	
		if(customer1.getBankAccountNo().equals(bankAccNo)  &&
				customer1.getPassword().equals(password))
				
		{
			System.out.println("----------------------------------");

			System.out.println("Welcome to the bank");
			
			int option;

			do {
				System.out.println("Please enter the option you want to perform");

				System.out.println("1. Deposit");
				System.out.println("2. Withdrawl");
				System.out.println("3. Transfer");
				System.out.println("0. Logout");
				
				System.out.println("----------------------------------");
				
				option = sc.nextInt();
				
				switch(option)
				{
				case 0:
					System.out.println("Doing logout");
					break;
				case 1:
					banking.deposit();
					break;
			
				case 2:
					banking.withdrawal();
					break;
					
				case 3:
					banking.transfer();
					break;
					
				}
					
			}
			while(option != 0);
			
			System.out.println("Exit from the application successfully");



		}
		else
		{
			System.out.println("Please provide valid credentials");
		}
	}

}
