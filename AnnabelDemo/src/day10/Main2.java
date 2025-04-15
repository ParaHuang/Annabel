package day10;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Main2 {
	public static void main(String[] args) {
		System.out.println("Try programiz.pro");

		for (int i = 100; i < 1000; i++) {
			int a = i / 100;
			int b = i / 10 % 10;
			int c = i % 10;

			if (a * a * a + b * b * b + c * c * c == i) {
				System.out.println(i);
			}
		}
	}
}