package milan.lab.report;

import java.util.Scanner;

public class Qn034 {
	Scanner input = new Scanner(System.in);
	String bookName, authorName;
	int bookPrice, numberOfPages;

	Qn034() {
		System.out.print("Enter book name: ");
		bookName = input.nextLine();

		System.out.print("Enter author name: ");
		authorName = input.nextLine();

		System.out.print("Enter book price: ");
		bookPrice = input.nextInt();

		System.out.print("Enter total number of pages in book: ");
		numberOfPages = input.nextInt();

		System.out.println("\nBook information");
		System.out.println("Book Name: " + bookName);
		System.out.println("Author: " + authorName);
		System.out.println("Price: " + bookPrice);
		System.out.println("Total no. of pages: " + numberOfPages);
	}

	public static void main(String[] args) {
		Qn034 qnObj = new Qn034();
	}
}
