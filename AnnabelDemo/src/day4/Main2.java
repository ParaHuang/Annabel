package day4;

public class Main2 {

	public static void main(String[] args) {
		// define a variable, name it poker, save an integer number 
		//print a sentence based on the value of poker
		//1 -- I have a Ace of heart
		//2 -- I have a 2 of heart
		//3 -- I have a 3 of heart
		//.........
		//10 -- I have a 10 of heart
		//11 -- I have a Jack of heart
		//12 -- I have a Queen of heart
		//13 -- I have a King of heart
		//14 -- I have a Joker
		//15 -- I have a Joker
		int poker = 15;
		
		switch (poker) {
			case 1:
				System.out.println("I have a ace of heart");
				break;
			case 2,3,4,5,6,7,8,9,10:
				System.out.println("I have a " + poker + " of heart");
				break;
			case 11:
				System.out.println("I have a Jake of heart");
				break;
			case 12:
				System.out.println("I have a Queen of heart");
				break;
			case 13:
				System.out.println("I have a King of heart");
				break;
			case 14,15:
				System.out.println("I have a Joker");
				break;
			default:
				System.out.println("invalid poker");
		}
	}
}





