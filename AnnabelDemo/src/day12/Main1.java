package day12;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[] {33,66,88,11,99,30,80,23,55,33,87,66};
		int[] arr = {33,66,88,11,99,30,80,23,55,33,87,66};
		//index:
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
		int max = arr[0];
		System.out.println("the elements are:");
		for(int i=0 ; i<arr.length  ; i++) {
			System.out.println(arr[i]);
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("the max number is:"+max);
		System.out.println("the min number is:???");
		
		
	}

}
