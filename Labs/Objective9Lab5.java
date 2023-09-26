import java.util.Scanner;

public class Objective9Lab5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

		//Prompt user for a number and store it as num1
		System.out.println("Please provide a number: ");
		num1 = kb.nextDouble();

		//Prompt user for next number and store as num2
		System.out.println("Please provide a second number: ");
		num2 = kb.nextDouble();


		//switch to choose option
		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
			case 1: 
				answer = findSum(num1, num2);
				System.out.println(num1 + " + " + num2 + " = " + answer);
				break;
			case 2:
				answer = findAverage(num1, num2);
				System.out.println("The average of " + num1 + " and " + num2 + " is: " + answer);
				break;
			case 3:
				System.out.println("The amount of tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + calcTax(num1, num2));
				break;
			case 4:
				System.out.println("You have chosen to quit.");
				keepGoing = false;
				break;
			default:
				System.out.println("I'm sorry, that is an invalid entry. Please try again.");
				break;
			}						
		}
	}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                       |");
		System.out.println("|   1. Add Numbers.     |");
		System.out.println("|   2. Find Average.    |");
		System.out.println("|   3. Calculate Tax.   |");
		System.out.println("|   4. Exit.            |");
		System.out.println("|                       |");
		System.out.println("=========================");
		System.out.println();
	}

	public static double findSum(double x, double y){
		double sum = x + y;
		return sum;
	}

	public static double findAverage(double x, double y){
		double avg = (x + y) / 2;
		return avg;
	}

	public static double calcTax(double x, double y){
		double tax = (x + y) * .083;
		return tax;
	}

}