package milan.lab.report;

public class Qn024 {
	public static void main(String[] args) {
		int sum = 0;
		int[] arrayVar = { 2, 3, 5, 8 };
		for (int a : arrayVar) {
			sum += a;
		}
		System.out.println("Sum of array elements is: " + sum);
	}
}