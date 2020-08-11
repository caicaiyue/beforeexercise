package exercise;

public class TestGenerics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestGenerics1().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		Animal[] animals = {new Dog(),new Cat(),new Dog()};
		Dog[] dogs = {new Dog(),new Dog(),new Dog()};
		takeAnimals(animals);
		takeAnimals(dogs);
	}

	private void takeAnimals(Animal[] animals) {
		// TODO Auto-generated method stub
		for(Animal a:animals){
			a.eat();
		}
	}

}

abstract class Animal{
	void eat(){
		System.out.println("animal eating");
	}
}

class Dog extends Animal{
	void eat(){
		System.out.println("Dog eating");
	}
	
	void bark(){
		System.out.println("Dog Bark");
	}
}

class Cat extends Animal{
	void eat(){
		System.out.println("Cat eating");
	}
	
	void meow(){
		System.out.println("Cat meow");
	}
}