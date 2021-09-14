package milan.lab.report;

public class NestedIf {
	public static void main(String[] args){
		int num = -6;
		if(num > 0)
		{
		if(num % 2 == 0)
		System.out.println(num + " is positive even number");
		else
		System.out.println(num + " is positive odd number");
		}
		else
		{
		if(num % 2 == 0)
		System.out.println(num + " is negative even number");
		else
		System.out.println(num + " is negative odd number");
		}
		}

}
