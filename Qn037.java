package milan.lab.report;

public class Qn037 {
	String bookName;
	String author;
	int price;

	Qn037(String bookName, String author, int price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	void infoDisplay() {
		System.out.println("Book Name: " + bookName);
		System.out.println("Book Author: " + author);
		System.out.println("Book Price: " + price);
	}

	public static void main(String[] args) {
		Qn037 b = new Qn037("JAVA", "Bhoj Raj Joshi", 555);
		b.infoDisplay();
	}
}