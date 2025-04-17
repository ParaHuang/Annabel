package day11;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array:several same type values together
		//list in python
//		int a=10,b=3,c=15,d=81,e=56;
		
		//define an array,declare the length of array
		//type[] name = new type[length];
		
		//define an int array, which can save 5 values
		int[] arr = new int[5];
		
		//name[index]
		//index:0 ~ length-1
		arr[0] = 22;
		arr[1] = 66;
		arr[2] = 99;
		arr[3] = 11;
		arr[4] = 44;
//		arr[5] = 88;		//wrong,index 5 is out of bounds, because the length is 5, therefore the biggest index is 4

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		

//		for( initial value ;  condition   ;  increment   )
		for(int i=0 ; i<5 ; i++ ) {
			System.out.println(arr[i]);
		}
	}

}






























