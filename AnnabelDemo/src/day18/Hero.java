package day18;


//OOP:
//encapsulation:
public class Hero {
	private String name;
	private int life;
	private int power;
	private String attackSkill;
	private String defendSkill;
	
	//name = "jack";	-> set up a value			-> setter	-> 	setName
	//sysout(name);		-> get the value of name	-> getter	->	getName
	
	//set up the value of name
	public void setName(String n) {
		name = n;
	}
	public void setLife(int life) {
		//add checking process here: when life is less than 100 or greater than 1000, then make program crash
		if(life < 100 || life > 1000) {
			throw new RuntimeException("invalid life value. "+life+" is not in the range of 100 to 1000");
		}
		this.life = life;
	}
	public void setPower(int p) {
		power = p;
	}
	//alt+/ -> show a hint
	public void setAttackSkill(String attackSkill) {
		//this->current object
		//when the parameter is as the same name as field
		//use this.name refers the field
		this.attackSkill = attackSkill;
	}
	
	public void setDefendSkill(String defendSkill) {
		this.defendSkill = defendSkill;
	}
	
	public String getName(){
		return name;
	}
	
	public int getLife() {
		return life;
	}
	
	public int getPower() {
		return power;
	}
	
	public String getAttackSkill() {
		return attackSkill;
	}
	
	public String getDefendSkill() {
		return defendSkill;
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
}
