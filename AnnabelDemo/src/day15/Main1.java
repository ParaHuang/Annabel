package day15;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = fun1();
		System.out.println(x);
		
		boolean y = fun2();
		System.out.println(y);
		
		boolean z = fun3(6,6);
		System.out.println(z);
	}
	
	/*
	public returnType methodName(type1 name1,type2 name2){
		operations
	}
	 */
	
	//with parameter, with return
	public static int fun1() {
		return 10;
	}
	
	public static boolean fun2() {
		return 1==1;
	}
	
	//figure out if a equals as b
	public static boolean fun3(int a,int b) {
		return a==b;
	}

}
