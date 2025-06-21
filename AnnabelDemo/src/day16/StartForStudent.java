package day16;

public class StartForStudent {
	//the entrance of program
	public static void main(String[] args) {
		//1.create an object of Student -> initialize
		//ClassName objectName = new ClassName();
		Student stu1 = new Student();	//new->create
		//set up the information of object
		//objectName.field = value;			//.		->		of ,   's
		stu1.number = 1001;
		stu1.name = "Mike";
		stu1.gender = "boy";
		stu1.age = 13;

//		System.out.println("the number of this student is "+stu1.number);
//		System.out.println("the name of this student is "+stu1.name);
//		System.out.println("the gender of this student is "+stu1.gender);
//		System.out.println("the age of this student is "+stu1.age);
		
		//call the method of object
		//objectName.method();
		stu1.learn();
		stu1.exam("Java");//"Java"
		
//		int x;
//		x = 10;
		System.out.println();
		
		Student stu2 = new Student();
		stu2.number = 1002;
		stu2.name = "Linda";
		stu2.gender = "gril";
		stu2.age = 14;
		
		stu2.learn();
		stu2.exam("Math");//"Math"
	}
}
