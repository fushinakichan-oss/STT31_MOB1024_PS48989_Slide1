package Slide1;
import java.util.ArrayList;

public class MainAnimal {
	public static void main(String[]args) {
		ArrayList<Animal>listAnimal=new ArrayList<Animal>();
		listAnimal.add(new Dog("Golden:",2));
		listAnimal.add(new Cat("Mr.White:",3));
		for(Animal a:listAnimal) {
			a.eat();
			a.sleep();
			a.sound();
		}
	}
}
