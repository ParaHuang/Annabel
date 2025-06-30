package day17;
//Online Java Compiler

//Use this editor to write, compile and run your Java code online

class Main {
	public static void main(String[] args) {
		// 1.create an object of Student -> initialize
		// ClassName objectName = new ClassName();
		Hero one = new Hero(); // new->create
//		one.name = "superman";
		one.setName("Jackson");		//super man
//		one.life = -200;
//		one.power = 50;
//		one.attactSkill = "laser eyes";
//		one.defendSkill = "Shield";
		
		
		one.attactEnemy();
		one.defendEnemy();
		one.dotask("treasure hunt", 5);
		one.dotask("working", 2);

		
		Hero two = new Hero();
		two.setName("Hawk");		//Hawk
		two.defendEnemy();
	}
}

//Encapsulation:make all fields private, make all method public ,we access private fields by public method
class Hero {
	// fields:name,life,power,attactSkill,defendSkill
	private String name;
	private int life;
	private int power;
	private String attactSkill;
	private String defendSkill;

	//getters and setters
	// name = "Spider Man";
	//set up for name   
	public void setName(String n) {
		name = n;
	}
	
	//methods:attactEnemy,defendEnemy,doTask
	public void attactEnemy() {
		System.out.println(attactSkill + " hits the enemy for " + power + " damage.");
	}

	public void defendEnemy() {
		System.out.println(name + " blocked the attack using " + defendSkill + " HP remains " + life);
	}

	public void dotask(String taskname, int lifegain) {
		life += lifegain;
		System.out.println(
				name + " finsish " + taskname + " gain " + lifegain + "points of life ，now life point is " + life);
	}
}