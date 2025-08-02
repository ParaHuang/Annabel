package day21;

//inheritance:to reuse the code
//declare Chinese is also Human
//class ChildClass extends ParentClass{}
//ChildClass/SubClass				ParentClass/SuperClass/BaseClass
public class Chinese extends Human{
	public void kungFu() {
		System.out.println("Chinese knows kungFu");
	}
}


//extends: base on some original content, there are something extra 
//every class inherit from Object, Object is the SuperClass of every class

class A{}
class B extends A{}
class C extends B{}
