package com.codesoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		//Here We create a variable num, for accept the user value and ch for perform a specific operation. 
		int i = 1, num, ch;

		//Here we create a variable rand to storing the random value for comaparing the user value 
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		int rNo = rand.nextInt(1, 100);
		System.out.println("Welcome to the Number Guessing Game (1 - 100)");
		System.out.println("--------------------------------");

		while (true) {
			
			System.out.println("Option 1, For Play Again Game");
			System.out.println("Option 2, For Exit The Game");
			System.out.println("Please select any one option");
			System.out.println("--------------------------------");
			ch = scn.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Please Guess the number");

				while (i <= 5) {
					num = scn.nextInt();
					if (rNo == num) {
						System.out.println("High ");
						System.out.println("You won the Game in " + i + " Attempts");
						break;

					} else {
						System.out.println("Low ");
					}
					i++;
					if(i==6)
						continue;
					System.out.println("Guess Again any Number");
				}
					System.out.println("You have Lost the Game");
				break;
			case 2:

				System.out.println("Thank You For Exit the Game");
				System.out.println("--------------------------------");
				continue;

			default:
				System.out.println("Invalid Choice Please Select Correct  Option");
				System.out.println("--------------------------------");
				continue;

			}

			System.out.println("Game Over");
			System.out.println("Thank for Playing Game");
			System.out.println("--------------------------------");
			
			continue;
		}
	}
}
