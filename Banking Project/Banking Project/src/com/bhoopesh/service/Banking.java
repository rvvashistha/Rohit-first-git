package com.bhoopesh.service;

import java.util.Scanner;

public class Banking {

	int bankBalance = 1000;
	
	Scanner sc = new Scanner(System.in);
	OTPGenerator otpG = new OTPGenerator();
	
	public void deposit()
	{
		int amount;
		System.out.println("Enter the amount you want to deposit");
		amount = sc.nextInt();
		
		if(amount > 0)
		{
			System.out.println("AMOUNT is " + amount + " deposit successfully");
			bankBalance = bankBalance + amount;
			System.out.println("Remaining balance is : " + bankBalance);
		}
		else
		{
			System.out.println("Enter the correct amount");
		}
	}
	
	public void withdrawal()
	{
		int amount;
		System.out.println("Enter the amount you want to withdrawl");
		amount = sc.nextInt();
		
		if(bankBalance - amount >= 0)
		{
			System.out.println("AMOUNT is " + amount + " withdrawl successfully");
			bankBalance = bankBalance - amount;
			System.out.println("Remaining balance is : " + bankBalance);
		}
		else
		{
			System.out.println("Inssufficient funds");
		}
	}
	
	public void transfer()
	{
		int amount;
		int otp;
		int otpGernerated;
		int bankAccountNo;
		
		System.out.println("Enter the otp");
		otpGernerated = otpG.generatreOTP();
		System.out.println(otpGernerated);
		
		otp = sc.nextInt();
		
		if(otp == otpGernerated)
		{
			System.out.println("OTP verification successfull");
			
			System.out.println("Enter the amount and accNo to which you want to transfer");
			amount = sc.nextInt();
			bankAccountNo = sc.nextInt();
			
			if(bankBalance - amount >= 0)
			{
				System.out.println("AMOUNT is " + amount + " transfer successfully to account " + bankAccountNo);
				bankBalance = bankBalance - amount;
				System.out.println("Remaining balance is : " + bankBalance);
			}
			else
			{
				System.out.println("Inssufficient funds");
			}
			
		}
		else
		{
			System.out.println("Please enter correct otp");
		}
	}
}
