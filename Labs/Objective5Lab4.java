import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int inputNum;

		System.out.println("Please enter a number: ");
		inputNum = keyboard.nextInt();

		if(inputNum % 2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");

		keyboard.close();
		}
	}
}