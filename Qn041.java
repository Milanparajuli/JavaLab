package milan.lab.report;

class Animals {
	void eat() {
		System.out.println("Eating...");
	}
}

class Cat extends Animals {
	void speak() {
		System.out.println("Meaow Meaow...");
	}
}

class PussyCat extends Cat {
	void weep() {
		System.out.println("Weeping...");
	}
}

public class Qn041 {
	public static void main(String[] args) {
		PussyCat a = new PussyCat();
		a.eat();
		a.speak();
		a.weep();
	}
}