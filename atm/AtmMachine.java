package com.atm;

import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		int i = 0;
		// pinNo=1234;
		AtmMethodImpl atm = new AtmMethodImpl();

		CustomerDetails customer = new CustomerDetails();

		Scanner scn = new Scanner(System.in);

		System.out.println("********WelCome to ATM Machine************");
	
		System.out.println("Enter your correct pin code");
		int Cpin = scn.nextInt();
		
		System.out.println("Enter Your Name");
		String cName = scn.next();
			
		System.out.println("Enter Your City");
		String cCity = scn.next();
		
		System.out.println("Enter Your correct  Account Number");
		Long cNo = scn.nextLong();
		System.out.println("*************************************");
		System.out.println("******Customer Account Details********");
		System.out.println("Customer Name :" + cName);
		System.out.println("Customer City : " + cCity);
		System.out.println("customer Account Number :" + cNo);
		System.out.println("*************************************");
		while (true) {
			if (customer.pinNo == Cpin || customer.accountNo==cNo) {
				System.out.println("************************************");
				System.out.println("---------------------");
				System.out.println("Option 1: Withdraw");
				System.out.println("Option 2: Deposit");
				System.out.println("Option 3: Check Balance");
				System.out.println("Option 4: Exit");
				System.out.println("--Choose any one option above - -");
				int option = scn.nextInt();
				switch (option) {
				case 1:
					atm.withdraw();
					break;
				case 2:
					atm.deposit();
					break;
				case 3:
					atm.checkBalance();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Select Invalid Option");
				}
			} else {
				System.out.println("Your pin code and Account nubmer are wrong");
				break;
			}

		}
		System.out.println("Thanks for visiting here");

	}

}
