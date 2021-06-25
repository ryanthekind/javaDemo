package com.ryanthekind;

import java.util.Scanner;

public class Calulator {

	public static void main(String[] args) {
		// Create an application that takes hours worked, then rate, and multiplies the
		// two variables to produce the total

		// create a scanner object instance for user input
		Scanner scanner = new Scanner(System.in);

		// create a counter that is in scope of the class
		double count = 0;

		// Greet the user:
		System.out.println("Hello! Welcome to Ryan's Program!!");

		// add line break
		System.out.println("");

		// Created a for loop that will ask the user to enter the total hours worked in
		// a week
		for (int i = 1; i <= 7; i++) {

			// ask user how many hours worked for 7 days
			System.out.printf("How many hours did you work on day %d?\n", i);
			String input1 = scanner.nextLine();
			double hours = Double.parseDouble(input1);

			count = count + hours; // count += hours?
		}

		// Display to the user the total hours worked
		System.out.println("Total hours worked: " + count);

		// get the user's hourly rate
		System.out.println("How much do you charge per hour?");
		String input2 = scanner.nextLine();
		double rate = Double.parseDouble(input2);

		double total = rate * count;

		// System.out.println("Based on the hourly rate of $" + rate + " the total
		// amount owed to you is: $" + total);

		// Display to the user how much they are owed for hours worked based on their
		// hourly rate
		System.out.printf("Based on the hourly rate of $%.2f the total amount owed to you is $%.2f\n", rate, total);

		// close scanner
		scanner.close();

		// line break
		System.out.println("");

		// Thank user
		System.out.println("Thank you for using my app!");

	}

}
