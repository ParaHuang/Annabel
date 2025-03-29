package day6;

public class Main1 {

	public static void main(String[] args) {
		// Leap year
//		int year = 2099; 	//2001,no		2004,yes    2100,no   1992yes,   1000no,  2000yes
	
		//it's divisible by 4 but not by 100,   or it's divisible by 400
		//				way1					||  way2
		
		
		//vertify a year, see if it's leap year
		//show all the leap year of 21century
		
		
		
//		if(year%4==0 && year%100!=0 ||  year%400==0) {
//			System.out.println(year + " is a leap year");
//		}
		
		
		//print every leap year of 21 century
		int i = 2000;				//1,initailize value
		while(i<2100) {				//2,condition
			if(i%4==0 && i%100!=0 || i%400 ==0){
				System.out.println(i);
			}
			i++;//i+=1;	//i=i+1;	//3,increment
		}
		
	}

}













