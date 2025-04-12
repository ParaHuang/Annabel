package day9;

public class Main2 {
	public static void main(String[] args) {
		//palindromic number
		//1001
		//9999
		//1221
		//6886
		//78987
		//123454321
		//to prove a 4 digit number is a palindromic number
//		int x = 2378;
		int x = 7997;
		
		//find out the 1st,2nd,3rd,4th digit
		int a = x/1000;			//1st, thousands  , in math:2.378  , in java:2, int number does operation with int number, then the result is still int number
		int b = x/100%10;		//2nd, hundreds
		int c = x/10%10;		//3rd, tens
		int d = x%10;			//4th, ones

//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);

//		if(the 1st number equals as the 4th number     and     the 2nd number equals as the 3rd number) {
		if(a == d && b == c) {
			System.out.println(x+" is a palindromic number");
		}else {
			System.out.println(x+" is a normal number");
		}
		
		
		//
		//1231
		
	}
}
