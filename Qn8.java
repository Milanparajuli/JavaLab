package milan.lab.report;

import java.util.Scanner;

public class Qn8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = input.nextInt();
		System.out.print("Enter second number: ");
		int n2 = input.nextInt();
		input.close();
		if (n1 > n2) {
			System.out.println("First number is greatest");
		}
		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
		}
	}
}
