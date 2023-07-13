class Animal {
	public void makeSound() {

	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog barks woww woww...");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Cat sounds Meow....");	
	}
}

// 
class Cow extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Cow Sounds Moooo....");
	}
}

public class AnimalSound{
	public static void main(String []args) {
		
		Animal dog = new Dog();
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.makeSound();
		
		Animal cow = new Cow();
		cow.makeSound();
	}
}
