package milan.lab.report;

public class Qn026 {
	public static void main(String[] args) {
		int arrayVar[] = { 2, 6, 17, 9 };
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (arrayVar[i] < arrayVar[j]) {
					int temp = arrayVar[i];
					arrayVar[i] = arrayVar[j];
					arrayVar[j] = temp;
				}
			}
		}
		System.out.println("Largest elements is: " + arrayVar[0]);
	}
}