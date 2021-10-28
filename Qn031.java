package milan.lab.report;

import java.util.Scanner;

public class Qn031 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arrVar = { 1, 2, 5, 12, 7, 3, 8 };

		System.out.println("Available Array:\n");
		for (int i = 0; i < arrVar.length; i++) {
			System.out.print(arrVar[i] + " ");
		}
		System.out.print("\nEnter Element to be deleted : ");
		int element = input.nextInt();

		for (int i = 0; i < arrVar.length; i++) {
			if (arrVar[i] == element) {
// shifting elements
				for (int j = i; j < arrVar.length - 1; j++) {
					arrVar[j] = arrVar[j + 1];
				}
				break;
			}
		}

		System.out.println("\nAfter removing element " + element + "\n");
		for (int i = 0; i < arrVar.length - 1; i++) {
			System.out.print(arrVar[i] + " ");
		}
	}
}