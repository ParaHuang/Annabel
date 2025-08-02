package day21;

// a template of object
public class Student {
	//fields, instance variable : no,name,age,class
	private int no;
	private String name;
	private int age;
	private String cls;
	public Student() {
		
	}
	public Student(String name, int age, String cls) {
		this.name = name;
		this.age = age;
		this.cls = cls;
	}
	public Student(int no, String name, int age, String cls) {
		//this	->	current object
		//when there is a variable name conflict, then we use this.variable  to refer to field
		this.no = no;
		this.name = name;
		this.age = age;
		this.cls = cls;
	}
	
//	public Student(int n,String na,int a,String c) {
//		no = n;
//		name = na;
//		age = a;
//		cls = c;
//	}
	
	
}
