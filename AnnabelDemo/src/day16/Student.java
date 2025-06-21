package day16;
//OOP:Object Oriented Programming
//abstraction: objects		->		class
public class Student {	//->template
	//part 1:field/instance variable/member variable: number,name,gender,age
	int number;
	String name;
	String gender;
	int age;
	
	//part 2:methods:learn,take exam	-> what the object can do
	public void learn() {
		System.out.println(name+" is learning,and that student is "+age+" years old now");
	}
	
	public void exam(String subject) {
		System.out.println(name+" is taking "+subject+" exam, and the number of that " + gender +" is "+ number);
	}
	
}
