package day19;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero("Spider Man",800,300,"spider net","shield");  //Spider Man,800,300,spider net,shield
//		h1.setName("Dr Strange");
//		h1.setLife(199);
		
		h1.attactEnemy();
		h1.defendEnemy();
		System.out.println();
		
		Hero h2 = new Hero("Dr Strange",900,200,"magic","cape");	//Dr Strange,900,200,magic,cape
		h2.attactEnemy();
		h2.defendEnemy();
		
//		String str = h2.toString();
		System.out.println(h2);
	}

}
