package day23;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		//create an ArrayList object
		//set up generic(data type restriction)
		ArrayList<String> list = new ArrayList<>();
		
		//1.add element
		//1.1 append an element
		list.add("hello");	//0
		list.add("hey");	//1
		list.add("ok");		//2
		//1.2 insert an element , available index:0~size
		list.add(1, "new value");
		
		list.add("correct");
		list.add("ok");
		
		//2.set element
		list.set(0, "HELLO");
		
		//3.get element
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		3.1 for-i loop
//		for(int i=0 ; i<list.size() ; i++) {
//			System.out.println(i+"--"+list.get(i));
//		}
		
//		3.2 advanced for loop / foreach
//		for(type variable:list/array/set) {
//			access every element by variable in order	
//		}
		
		for(String e:list) {
			System.out.println(e);
		}
		
		//4.remove element
		//4.1 remove by index,return the value you just removed
//		String e = list.remove(1);
//		System.out.println("you just removed:"+e);
		//4.2 remove the object directly(if there are more than 1 target element)
		//return a boolean value to represent if you remove value successfully
		boolean f1 = list.remove("OK");
		System.out.println(f1);
		
		//5.contains
		boolean f2 = list.contains("ok");
		System.out.println(f2);
		
		//6.indexOf:return the index of first target element,return -1 if the element doesn't exist 
		int i = list.indexOf("okk");
		System.out.println(i);
		System.out.println(i!=-1);//false:not exist
		

		System.out.println(list);
	}

}
