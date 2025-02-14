package day3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int x = 15;
		
		if(x < 20) {
			System.out.println("A");
			x+=10;//25
		}else if(x<30) {
			System.out.println("B");
			x+=10;
		}else if(x<40) {
			System.out.println("C");
			x+=10;
		}else {
			System.out.println("D");
			x+=10;
		}
	
		System.out.println(x);
		
		
		
	}

}
