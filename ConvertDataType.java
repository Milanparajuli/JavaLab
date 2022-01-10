package milan.lab.report;

public class ConvertDataType {
	public static void main(String[] args) {
		// automatic type conversion
		int i = 100;
		long l = i;
		float f = l;
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
		System.out.println("\n");
		// explicit type casting
		double d = 100.04;
		long lon = (long) d;
		int num = (int) lon;
		System.out.println("Double value " + d);
		// fractional part lost
		System.out.println("Long value " + lon);
		System.out.println("Int value " + num);
	}
}
