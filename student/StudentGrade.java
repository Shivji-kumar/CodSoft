package com.student;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		int i = 0, avg, num, sub, total = 0;

		System.out.println("Student Grade Calculate System Our College Student");
		Scanner scn = new Scanner(System.in);
		System.out.println("**********************************");		
		
		System.out.println("Enter Number of Subjects for finding the Grade");
		num = scn.nextInt();		

		if(num>=5 && num<=10) {
			while (i < num) {
				System.out.println("**********************************");
				System.out.println("Enter Student Subject By Marks (1-100)");
				sub = scn.nextInt();
								
				total = total + sub;
				i++;
			
			}  
				System.out.println("**********************************");
				System.out.println("Student obtained : " + total + " Marks ");
				System.out.println("**********************************");
				avg = total / num;
				System.out.println("**********************************");
				System.out.println("Student average percentage, : " + avg + " % ");
				System.out.println("**********************************");
				
				if (avg >= 90) {
					System.out.println("Students are passed With Grade A++");
				} else if (avg >= 80) {
					System.out.println("Students are passed With Grade A");
				} else if (avg >= 70) {
					System.out.println("Students are passed With Grade B++");
				} else if (avg >= 60) {
					System.out.println("Students are passed With Grade B");
				} else if (avg >= 50) {
					System.out.println("Students are passed With Grade C++");
				} else if (avg >= 40) {
					System.out.println("Students are passed With Grade B");
				} else {
					System.out.println("Students are Faild");
				}
			}
	
		else
		{
			System.out.println("**********************************");
			System.out.println("Please enter under 5-10 subject");
			System.out.println("Our Grading system consits of 5 subject");
		}
	}
}
