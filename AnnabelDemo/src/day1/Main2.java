package day1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);	//scan the input equipment of system
		
		System.out.println("enter radius:");
		double radius = scr.nextDouble();	//input a double number,save it in radius
//		double radius = 50;
		double perimeter = 2*3.14*radius;
		System.out.println("Perimeter:"+ perimeter);

	}

}
