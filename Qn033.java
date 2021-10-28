package milan.lab.report;

import java.util.Scanner;

public class Qn033 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, address, email;
		Long phoneNo;
		System.out.println("Enter your Details");
		System.out.print("What is your name? ");
		name = input.nextLine();

		System.out.print("Enter your full address: ");
		address = input.nextLine();

		System.out.print("Enter your email: ");
		email = input.nextLine();

		System.out.print("Enter your phone Number: ");
		phoneNo = input.nextLong();

		System.out.println("\n\nYour Personal Details");
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNo);
		System.out.println("Email: " + email);
	}
}