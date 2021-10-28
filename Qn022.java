package milan.lab.report;

import java.util.Scanner;

public class Qn022 {
	public static void main(String[] args) {
		int number, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = input.nextInt();
		System.out.print("Enter second number: ");
		int n2 = input.nextInt();
		for (number = n1; number <= n2; number++) {
			int count = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0 && number != 1)
				sum += number;
		}
		System.out.print("Sum of prime number between " + n1 + " to " + n2 + " is " + sum);
	}
}