import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		/*
		 * This is a a program I created to simulate an ATM system using output to the
		 * Java console: Build specifications: The 3 options presented by the ATM will
		 * run until the user decides to exit the machine. the withdrawal and deposited
		 * amounts are stored into the variable "num" and are added or- -subtracted to
		 * the current running balance accordingly. the loop stores information as it
		 * goes and will not forget the user's running balance.
		 * Author - Jackson Convis
		 */
		System.out.println("Welcome to Java Banking!");
		Scanner scan = new Scanner(System.in);
		double balance = 10000;
		int choice;
		double num;
		do {
			header();
			choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("Enter desired withdrawal amount");
				num = scan.nextDouble();
				balance = balance - num;
			} else if (choice == 2) {
				System.out.println("Please deposit checks or cash amount below (enter an number)");
				num = scan.nextDouble();
				balance = balance + num;
			} else if (choice == 3) {
				System.out.println("Your current balance is: " + balance);
			}

		} while (choice == 1 || choice == 2 || choice == 3);
		System.out.println("Have a great day! Thanks for banking with Java!");
		scan.close();
	}

	public static void header() {
		System.out.println("Please select an option");
		System.out.println(" 1. Withdrawal \n 2. Deposit \n 3. Check Balance \n 4. End Transaction");
	}
}
