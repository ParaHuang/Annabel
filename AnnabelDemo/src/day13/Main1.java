package day13;

public class Main1 {

	public static void main(String[] args) {
		med1();
		med2();
		System.out.println();
		
		med3(6,"hey");			//6times of hey
		System.out.println();
		med3(4,"hola");			//4times of hola
		System.out.println();
		med3(9,"Bonjour");		//9times of Bonjour
	}
	
	//method:no parameter no return
	public static void med1(){
		System.out.println("D");
		System.out.println("A");
		System.out.println("F");
		System.out.println("P");
		System.out.println("have a ultimate skill");
	}
	
	//print hello for 5 times
	public static void med2() {
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("hello");
		}
	}

	public static void med3(int n,String m) {
		for(int i=1 ; i<=n ; i++) {
			System.out.println(m);
		}
	}
	

}
//D->	move forward
//A->	move backwards
//space->	jump
//F->	shoot a bullet
//s->	crouch
//P->	kick

//DAFP	->	ultimate skill 
//	|
//med1





