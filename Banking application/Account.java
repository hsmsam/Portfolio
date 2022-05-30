package bankingApplication;

import java.util.Scanner;

public class Account {

	int balance;
	int previousTransaction;
	String customerName;
	String customerID;

	Account(String name, String id) {
		customerName = name;
		customerID = id;
	}

	void deposit(int amount) {
		if (amount > 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	void withdraw(int amount) {
		if (amount > 0) {
			balance = balance - amount;
			previousTransaction = -amount;

		}
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occured");
		}
	}

	void calculateInterest(int years) {
		double interestRate = .01;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate));
		System.out.println("After " + years + " years, your balance will be: " + newBalance);
	}

	void showMenu() {
		char option = '6';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, " + customerName + "!");
		System.out.println("Your ID is: " + customerID);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1. Check balance");
		System.out.println("2. Deposit money");
		System.out.println("3. Withdraw money");
		System.out.println("4. View previous transaction");
		System.out.println("5. Calculate interest");
		System.out.println("6. Exit");

		do {
			System.out.println();
			System.out.println("Pick an option: ");
			char option1 = scanner.next().charAt(0);
			System.out.println();

			switch (option1) {
			case '1':
				System.out.println("=====================");
				System.out.println("Balance = £" + balance);
				System.out.println("=====================");
				System.out.println();
				break;
			case '2':
				System.out.println("Enter an amount to deposit: ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
			case '3':
				System.out.println("Enter an amount to withdraw: ");
				int amount1 = scanner.nextInt();
				withdraw(amount1);
				System.out.println();
				break;
			case '4':
				System.out.println("=====================");
				getPreviousTransaction();
				System.out.println("=====================");
				System.out.println();
				break;
			case '5':
				System.out.println("How many years of interest: ");
				int years = scanner.nextInt();
				calculateInterest(years);
				break;
			case '6':
				System.out.println("=====================");
				break;
			default:
				System.out.println("Error: invalid option. Please enter 1,2,3,4,5,6");
				break;
			}
		} while (option != '6');
		System.out.println("Thank you for banking with us!");
	}
}
