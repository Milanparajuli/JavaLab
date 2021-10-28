package milan.lab.report;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count = 0, n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		n = input.nextInt();
		int arrayVar[] = { 2, 6, 17, 9, 15, 9, 4, 7, 9, 2, 9 };
		for (int i = 0; i < arrayVar.length; i++) {
			if (n == arrayVar[i])
				count++;
		}
		if (count != 0)
			System.out.println(n + " is in array and repeated " + count + " times.");
		else
			System.out.println(n + " is not in array.");
	}
}