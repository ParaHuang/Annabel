package day4;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int day = 7;
		//1-	print Monday
		//2-	print Tuesday
		//...
		//7-	print Sunday
		//others-invalid date
		/*
		if(day == 1) {
			System.out.println("Monday");
		}else if(day == 2) {
			System.out.println("Tuesday");
		}else if(day == 3) {
			System.out.println("Wednesday");
		}else if(day == 4) {
			System.out.println("Thursday");
		}else if(day == 5) {
			System.out.println("Friday");
		}else if(day == 6) {
			System.out.println("Saturday");
		}else if(day == 7) {
			System.out.println("Sunday");
		}else {
			System.out.println("invalid date");
		}
		*/	
		int day = 1;
		switch(day) {
			case 1:
				System.out.println("Monday");
				break;//interrupt the whole switch...case structure
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("invalid date");
		}
			
		
	}

}

//define a variable, name it poker, save an integer number (1~15)
//print a sentence based on the value of poker
//1		--		I have a Ace of heart
//2		--		I have a 2 of heart
//3		--		I have a 3 of heart
//.........
//10		--	I have a 10 of heart
//11		--	I have a Jack of heart
//12		--	I have a Queen of heart
//13		--	I have a King of heart
//14		--	I have a Joker
//15		--	I have a Joker









