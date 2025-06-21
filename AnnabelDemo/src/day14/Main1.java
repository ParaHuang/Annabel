package day14;

public class Main1 {

	public static void main(String[] args) {
		calculator(19,23,"+");//19+23=42
		calculator(43,5,"-");//43-40
		calculator(21,2,"*");
		calculator(98,5,"/");
	}
	
	//define a method, to calculate the sum of 2 numbers
	//print the result
	public static void calculator(int numberOne, int numberTwo,String operation) {
		switch(operation) {
			case "+":
				System.out.println(numberOne + operation +numberTwo +"="+ (numberOne + numberTwo));
				break;
			case "-":
				System.out.println(numberOne + operation +numberTwo +"="+ (numberOne - numberTwo));
				break;
			case "*":
				System.out.println(numberOne + operation +numberTwo +"="+ (numberOne * numberTwo));
				break;
			case "/":
				System.out.println(numberOne + operation +numberTwo +"="+ (numberOne / numberTwo));
			
		}
		
		
	}
	

}
