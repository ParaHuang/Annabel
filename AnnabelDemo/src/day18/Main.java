package day18;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
//		h1.name = "Spider Man";
		h1.setName("Spider Man");		//Spider Man
//		h1.life = -600;
		h1.setLife(600);
//		h1.power = 240;
		h1.setPower(240);
//		h1.attactSkill = "spider net";
		h1.setAttactSkill("spider net");
//		h1.defendSkill = "shield";
		h1.setDefendSkill("shield");
		
		h1.attactEnemy();
		h1.defendEnemy();
		h1.dotask("save the city", 100);
		
		System.out.println();
		
		Hero h2 = new Hero();
		h2.setName("Dr Strange");		//
		h2.setLife(500);
		h2.setPower(300);
		h2.setAttactSkill("magic");
		h2.setDefendSkill("cape");
		
		h2.attactEnemy();
		h2.defendEnemy();
	}

}
