package day2;

public class Main1 {

	public static void main(String[] args) {
		//operators:
		
		int x = 10;
		int y = 3;
		
		System.out.println(x%y);
		System.out.println(10/3);//3.333333333->3
		System.out.println(3+5*2 > 5/2+10);
		
		System.out.println();
		System.out.println(!true);	//false
		System.out.println(!false);	//true
		
		System.out.println();
		//&&: and, both statements are true, then the result is true
		System.out.println(true && true);		//true
		System.out.println(true && false);		//false
		System.out.println(false && true);		//false
		System.out.println(false && false);		//false
		//if tomorrow is sunny day, and I get paid, then I go shopping
		//situation 1: tomorrow is sunny day, I get paid 			-> yes, shopping 
		//situation 2: tomorrow is sunny day, I didn't get paid 	-> no,no shopping 
		//situation 3: tomorrow is raining day, I get paid 			-> no,no shopping 
		//situation 4: tomorrow is raining day, I didn't get paid 	-> no,no shopping 
		
		System.out.println();
		//||: or, any statement is true, then the result is true
		System.out.println(true || true);		//true
		System.out.println(true || false);		//true
		System.out.println(false || true);		//true
		System.out.println(false || false);		//false
		//if tomorrow is sunny day, or I get paid, then I go shopping
		//situation 1: tomorrow is sunny day, I get paid 			-> yes, shopping
		//situation 2: tomorrow is sunny day, I didn't get paid 	-> yes, shopping
		//situation 3: tomorrow is raining day, I get paid 			-> yes, shopping
		//situation 4: tomorrow is raining day, I didn't get paid 	-> no,no shopping

		System.out.println();
		System.out.println(true && false && true);	//false
		System.out.println(true || false || true);	//true
		
		// priority:   &&   >  ||
		System.out.println(true || true && false); 	//true

		System.out.println(3+5>8 || 9/2==4);	//true
		System.out.println(3+5>8 && 9/2==4);	//false

		System.out.println();
		//x = 10;
		x+=3;	//x = x + 3;	//13
		x-=5;	//x = x - 5; 	//8		
		x*=4;	//x = x * 4;	//32
		x/=3;	//x = x / 3; 	//10
		x%=7;	//x = x % 7;	//3
		
		System.out.println(x);
		
		boolean z = 3+5>8 && 9/2==4;
	}

}









