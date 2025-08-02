package day20;

public class Main {

	public static void main(String[] args) {
		Date d1 = new Date(2024, 8, 23);

//		System.out.println(d1.toString());
		System.out.println(d1);
		
		Date d2 = new Date(2025,8);
		System.out.println(d2);
		Date d3 = new Date (2025);
		System.out.println(d3);
		Date d4 = new Date();
		System.out.println(d4);
	}

}

//define a class to record date information (year,month,day)
class Date {
	private int year;
	private int month;
	private int day;

	// when you create Date object, you set up values for fields
	public Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public Date(int y,int m) {
		//this(value1,value2,value3,value4)		is calling the other constructor of this class
		this(y,m,1);
//		year = y;
//		month = m;
//		day = 1;
	}

	public Date(int y) {
		this(y,1,1);
//		year = y;
//		month = 1;
//		day = 1;
	}
	
	public Date() {
		this(2023,1,1);
//		year = 2023;
//		month = 1;
//		day = 1;
	}

	// 1.to get the String format of Date object
	// 2.be called automatically when you print object
	public String toString() {
		return "Today is " + year + "-" + month + "-" + day;
	}
}