package day10;

class Main {
	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			int a = i / 1000;
			int b = i / 100 % 10;
			int c = i / 10 % 10;
			int d = i % 10;

			if (a == d && b == c) {
				System.out.println(i + " is a palindromic number");
			}
		}

	}
}