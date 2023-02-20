package february2023;

public class Animal {
	public void animalSound() {
		System.out.println("Animals makes sound");
	}
public static void main(String[] args) {
	Animal myanimal=new Animal();
	Animal mypig=new Pig();
	Animal mydog=new Dog();
	myanimal.animalSound();
	mypig.animalSound();
	mydog.animalSound();
	
}
}
