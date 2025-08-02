package day19;

public class Hero {
	//fields--global variables
	private String name;
	private int life;
	private int power;
	private String attackSkill;
	private String defendSkill;

	public Hero() {
		System.out.println("empty constructor");
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	//				parameters--local variables
	public Hero(String name, int life, int power, String attackSkill, String defendSkill) {
		//when local variable is in the same name as global variable, then we use this.  to refers the global one
		this.name = name;
		this.life = life;
		this.power = power;
		this.attackSkill = attackSkill;
		this.defendSkill = defendSkill;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		if(life<100 || life>1000) {
			throw new RuntimeException("invalid life value,"+life+" is not within 100~1000");
		}
		this.life = life;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getAttackSkill() {
		return attackSkill;
	}
	public void setAttackSkill(String attackSkill) {
		this.attackSkill = attackSkill;
	}
	public String getDefendSkill() {
		return defendSkill;
	}
	public void setDefendSkill(String defendSkill) {
		this.defendSkill = defendSkill;
	}
	public void attactEnemy() {
		System.out.println(attackSkill + " hits the enemy for " + power + " damage.");
	}

	public void defendEnemy() {
		System.out.println(name + " blocked the attack using " + defendSkill + ", HP remains " + life);
	}

	public void dotask(String taskname, int lifegain) {
		life += lifegain;
		System.out.println(
				name + " finsish " + taskname + ", gain " + lifegain + " points of life ，now life point is " + life);
	}

	//a method supply the String format of a Hero object
	//toString will be called automatically when you print the object(purpose:check if all data are correct or not)
	@Override
	public String toString() {
		return "Hero [name=" + name + ", life=" + life + ", power=" + power + ", attackSkill=" + attackSkill
				+ ", defendSkill=" + defendSkill + "]";
	}
	
	public void method1() {
		System.out.println("calling method1");
	}
	
	public void method1(int x) {
		System.out.printf("---------method1 with 1 int parameter:%d-----------\n",x);
	}
	
	public void method2() {
		System.out.println("calling method2");
	}
	
}
