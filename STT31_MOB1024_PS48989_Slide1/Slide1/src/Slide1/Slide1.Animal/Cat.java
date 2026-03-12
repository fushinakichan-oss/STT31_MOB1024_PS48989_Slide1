package Slide1;

public class Cat extends Animal{
	public Cat(String name, int age) {
		super(name,age);
	}
    public void meow() {
    	System.out.println(name + "meow meoow!!!");
    }
    public void sound() {
    	System.out.println(name + "phát ra âm thanh-meow meoow!!!");
    }
}
