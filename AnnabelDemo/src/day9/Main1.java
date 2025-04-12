package day9;

public class Main1 {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++) {
			if(i==3) {
//				continue;		//skip the current time of the loop ,directly continue the next time
//				break;			//end the loop
				return;			//end the program
			}
			System.out.println(i);
		}
		System.out.println("the end");
	}

}
