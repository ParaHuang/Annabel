package day3;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// define a int variable score, enter a number to save in score
		// print the level of this score
		
		// <60		fail
		// 60~69	pass          score>60 && score<70
		// 70~79	good
		// 80~100	excellent	
		
//		if(statement1){
//		     operationA
//		}else if(statement2){
//		     operationB
//		}else if(statement3){
//		     operationC
//		}else{
//		    operationD
//		}
		System.out.println("please enter your score:");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if(score < 60) {
			System.out.println("fail");
		}else if(score<70) {
			System.out.println("pass");
		}else if(score<80) {
			System.out.println("good");
		}else {
			System.out.println("excellent");
		}
		//when the score is less than 60, it will execute the if part
		//question: when the program execute one the rest part
		//can I think the score is definitely greater or equals than 60?
		
		
		
		
		
		
		
	}

}
