package com.currency;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Currency {
	public static void main(String[] args) {
		System.out.println("**************************************");
		System.out.println("WelCome to Currency Converter System");
		System.out.println("-------------------------------------");
		
		double amount;
		double rupee,dollar,pound,euro,yen,ringgit;
		int choice;
		
		DecimalFormat f=new DecimalFormat("##.##");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select one for Converting your amount from :");
		System.out.println("-------------------------------------");
		System.out.println("Option 1 : Rupee --------------");
		System.out.println("Option 2 : Dollar -------------");
		System.out.println("Option 3 : Pound---------------");
		System.out.println("Option 4 : Euro ----------------");
		System.out.println("Option 5 : Yen ----------------");
		System.out.println("Option 6 : Ringgit -------------");
		
		System.out.println("Choose from above options :");
		System.out.println("**************************************");
		choice =sc.nextInt();
		
		
		System.out.println("Enter the amount you want to convert?");
	      amount = sc.nextFloat();
	    
	 
	      switch (choice)
	      {
	         case 1:  // Ruppe Conversion
	            dollar = amount / 70;
	            System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
	 
	            pound = amount / 88;
	            System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");
	 
	            euro = amount / 80;
	            System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
	 
	            yen = amount / 0.63;
	            System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");
	 
	            ringgit = amount / 16;
	            System.out.println(amount + " Rupee = " + f.format(ringgit) + " ringgit");
	            break;
	 
	         case 2:  // Dollar Conversion
	            rupee = amount * 70;
	            System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");
	 
	            pound = amount *0.78;
	            System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");
	 
	            euro = amount *0.87;
	            System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
	 
	            yen = amount *111.087;
	            System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
	 
	            ringgit = amount *4.17;
	            System.out.println(amount + " Dollar = " + f.format(ringgit) + " ringgit");
	            break;
	 
	         case 3:  // Pound Conversion
	            rupee = amount * 88;
	            System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");
	 
	            dollar = amount *1.26;
	            System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");
	 
	            euro = amount *1.10;
	            System.out.println(amount + " pound = " + f.format(euro) + " Euro");
	 
	            yen = amount *140.93;
	            System.out.println(amount + " pound = " + f.format(yen) + " Yen");
	 
	            ringgit = amount *5.29;
	            System.out.println(amount + " pound = " + f.format(ringgit) + " ringgit");
	            break;
	 
	         case 4:  // Euro Conversion
	            rupee = amount * 80;
	            System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");
	 
	            dollar = amount *1.14;
	            System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");
	 
	            pound = amount *0.90;
	            System.out.println(amount + " euro = " + f.format(pound) + " Pound");
	 
	            yen = amount *127.32;
	            System.out.println(amount + " euro = " + f.format(yen) + " Yen");
	 
	            ringgit = amount *4.78;
	            System.out.println(amount + " euro = " + f.format(ringgit) + " ringgit");
	            break;
	 
	         case 5:  // Yen Conversion
	            rupee = amount *0.63;
	            System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");
	 
	            dollar = amount *0.008;
	            System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");
	 
	            pound = amount *0.007;
	            System.out.println(amount + " yen = " + f.format(pound) + " Pound");
	 
	            euro = amount *0.007;
	            System.out.println(amount + " yen = " + f.format(euro) + " Euro");
	 
	            ringgit = amount *0.037;
	            System.out.println(amount + " yen = " + f.format(ringgit) + " ringgit");
	            break;
	 
	         case 6:  // Ringgit Conversion
	            rupee = amount *16.8;
	            System.out.println(amount + " ringgit = " + f.format(rupee) + " Ruppes");
	 
	            dollar = amount *0.239;
	            System.out.println(amount + " ringgit = " + f.format(dollar) + " dollar");
	 
	            pound = amount *0.188;
	            System.out.println(amount + " ringgit =: " + f.format(pound) + " pound");
	 
	            euro = amount *0.209;
	            System.out.println(amount + " ringgit = " + f.format(euro) + " euro");
	 
	            yen = amount *26.63;
	            System.out.println(amount + " ringgit = " + f.format(yen) + " yen");
	            break;
	
	         default:
	            System.out.println("Invalid Input");
	      }
	      System.out.println("Thank you for visiting here");
	      System.out.println("**************************************");
		
		
	}

}
