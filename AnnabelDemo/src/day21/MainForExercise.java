package day21;

public class MainForExercise {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.breath();
		System.out.println();
		
		Fish fish = new Fish();
		fish.breath();
		fish.swim();
		System.out.println();
		
		Bird bird = new Bird();
		bird.breath();
		bird.fly();
		System.out.println();
		
		Shark shark = new Shark();
		shark.breath();
		shark.swim();
		shark.hunt();
	}

}

class Animal{
	public void breath() {
		System.out.println("Animal is breathing...");
	}
}

class Fish extends Animal{
	public void swim() {
		System.out.println("Fish is swimming");
	}
}

class Bird extends Animal{
	public void fly() {
		System.out.println("Bird is flying");
	}
}

class Shark extends Fish{
	public void hunt() {
		System.out.println("Shark is hunting");
	}
}












