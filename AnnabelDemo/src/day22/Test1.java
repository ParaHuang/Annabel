package day22;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		//array
		int[] arr = new int[5];
		
//		arr[0] = 12;
//		arr[1] = 99;
//		arr[2] = 34;
//		arr[3] = 10;
//		arr[4] = 78;
		
		System.out.println(arr.length);

		//array has a shortage, which is the length is unchangeable	
		
		
		
		//ArrayList is something similar to array, but the size is dynamic
		ArrayList list = new ArrayList();	//create an empty list
		
		//add value
		list.add(12);
		list.add(99);
		list.add("hello");
		list.add(10);
		list.add(78);
		
		int s = list.size();
		System.out.println(s);
		
		System.out.println("the values saved in list are:");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
	}

}
