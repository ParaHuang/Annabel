package day8;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// I'm an owner of pet shop, I want to buy more pets, requirement is:
		// I want to buy cats and dogs, I buy 1 animal for each time, once I bought 5 cats, then I stop buying
	
		// when everything is finished, I would have 5 cats
		// how many dogs? not sure
		Scanner scanner = new Scanner(System.in);
		int count = 0;		//to represent the count of cat.in the beginning, there is no cat
		//process
		while(true) {
			System.out.println("what do you gonna buy? 1-dog, 2-cat:");
			int option = scanner.nextInt();
			//calculate how many cats now
			if(option == 2) {		//calculating how many cats now
				count++;
			}
			//check if there if 5 cats
			if(count==5) {
				//finished the process
				break;		//break down the loop
			}
		}
		System.out.println("you bought enough pets now!");
		
	}

}
