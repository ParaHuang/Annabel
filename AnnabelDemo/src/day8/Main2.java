package day8;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Random random = new Random();
//		int secretNumber = random.nextInt();	//generate a big random number
//		int secretNumber = random.nextInt(5);	//0~4,generate a number from 0 ~bound-1
		int secretNumber = random.nextInt(1, 101); // 1~100,generate a number from 0 ~bound-1
//		System.out.println(secretNumber);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("guess what it is?");
			int guess = scanner.nextInt();// input a number
			if (guess > secretNumber) {
				System.out.println("too big");
			} else if (guess < secretNumber) {
				System.out.println("too small");
			} else {
				System.out.println("congratulations, you got it correctly");
				break;
			}
		}

	}
}
