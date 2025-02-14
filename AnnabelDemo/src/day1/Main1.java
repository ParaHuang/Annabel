package day1;

public class Main1 {
	//java: strong type language(we need to be specific about data type)
	public static void main(String[] args) {
		
		System.out.println("hello"); //ln:line
		
		//short  int   long     double   float    char   boolean    byte
		//type  variableName = value;
		//define a variable, call it x , save 10 in this variable
		//python:
		// x = 10
		//java:
		short x = 32767;   //-32768~32767
		int y = 10;
		y = 99;
		//2^32  = 65535
		//define a variable, call it z , save 3.14 in this variable
		double z = 100.99;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//z = 3.15
//		System.out.println("z = " + z);	//connect string and variable
		System.out.println("x="+x+" y="+y+" z="+z);
		
		int a = 10*y;
		System.out.println(a);
		
		//define a variable, it represent the radius of an circle
		//save a number inside(you can decide)
		//calculate the perimeter and area of this circle
	}
}


/*
def methodName():
	xxxx
	xxxx
	if xxx:
		xxxxx
		xxxxx
 */





