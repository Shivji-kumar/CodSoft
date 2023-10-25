package com.atm;

import java.util.Scanner;

public class AtmMethodImpl implements AtmMethod{
	int withdraw,deposit,balance=500;
	Scanner scn=new Scanner(System.in);

	@Override
	public void withdraw() {
		System.out.println("Enter Withdraw Amount");
		withdraw = scn.nextInt();
		if (balance < withdraw) {
			System.out.println("Sorry insufficient balance");
		} else {
			balance = balance - withdraw;
			System.out.println("SuccessFully Withdraw");
			System.out.println("---------------------");
		}
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter Deposit Amount ");
		deposit = scn.nextInt();

		balance = balance + deposit;
		System.out.println("Successfully Deposit");
		System.out.println("---------------------");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Your Account Balance :" + balance);
		System.out.println("---------------------");
		
	}

}
