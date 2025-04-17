package day11;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		//type[] name = new type[length];
		//define an array, which saves the grades of 5 students
		int[] grades = new int[5];
		//enter grade 1 by 1, save them in this array
		Scanner scr = new Scanner(System.in);
		
//		grades[0] = scr.nextInt();
//		grades[1] = scr.nextInt();
//		grades[2] = scr.nextInt();
//		grades[3] = scr.nextInt();
//		grades[4] = scr.nextInt();
		
		
		for(int i=0 ; i<5 ; i++) {
			grades[i] = scr.nextInt();
		}
		
		System.out.println("the grades you just input are:");
		for(int i=0 ; i<5 ; i++) {
			System.out.println(grades[i]);
		}
		
		
		
		System.out.println("the end");
		
//		arr[0] = 22;
		
	}
}
