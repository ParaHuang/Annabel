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
		h1.setAttackSkill("spider net");
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
		h2.setAttackSkill("magic");
		h2.setDefendSkill("cape");
		
		h2.attactEnemy();
		h2.defendEnemy();

//		System.out.println("the name of second hero is "+h2.getName());
//		System.out.println("the life point of second hero is "+h2.getLife());
//		System.out.println("the power point of second hero is "+h2.getPower());
//		System.out.println("the attact skill of second hero is "+h2.getAttackSkill());
//		System.out.println("the defend skill of second hero is "+h2.getDefendSkill());
		
		//escaping character
		//	\n	->	new line
		
		//placeholder
		//%s->String		%d->int
		//print with a format(without changing line)
		System.out.printf("the name of second hero is %s\n",h2.getName());
		System.out.printf("the life point of second hero is %d\n",h2.getLife());
		System.out.printf("the power point of second hero is %d\n",h2.getPower());
		System.out.printf("the attack skill of second hero is %s\n",h2.getAttackSkill());
		System.out.printf("the defend skill of second hero is %s\n",h2.getDefendSkill());
//		System.out.print();		//print without changing line
//		System.out.println();//print a line
		
	}

}
