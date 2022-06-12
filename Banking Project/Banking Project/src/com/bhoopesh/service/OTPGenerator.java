package com.bhoopesh.service;

public class OTPGenerator {
	
	public int generatreOTP()
	{
		int randomPIN = 0;

		randomPIN = (int) (Math.random() * 9000 + 1000);
		
		return randomPIN;
	}

}
