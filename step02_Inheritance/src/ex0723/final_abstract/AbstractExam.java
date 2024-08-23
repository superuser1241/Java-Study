package ex0723.final_abstract;

/**
 * 동물들의 공통의 속성과 메소드 정의
 */
abstract class Animal{
	int lges;//다리 수
	public abstract void sound();
	public abstract void run();
	public void eat() {
		System.out.println("고기를 좋아한다");
	}
}

class Dog extends Animal{
	public void sound() {
		System.out.println("멍멍");
	}
	public void run() {
		System.out.println("잘 뛴다!");
	}
}

class Pig extends Animal{

	@Override
	public void sound() {
		System.out.println("꿀꿀");
		
	}

	@Override
	public void run() {
		System.out.println("느리다");
		
	}
	
}
class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("야옹");
		
	}

	@Override
	public void run() {
		System.out.println("잘 뛰고 잘 올라간다");
		
	}
	public void eat() {
		System.out.println("고양이는 쥐를 먹는다!");
	}
	
}

public class AbstractExam {
	public static void test(Animal animal) {//Cat or Pig or Dog...
		//각 동물들의 메소드를 호출해보자
		animal.sound();
		animal.run();
		animal.eat();
		
	}

	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
		//필드를 이용한 다형성
		Animal an = new Cat();
		test(an);
		System.out.println("-------------------------------------------");
		an = new Pig();
		test(an);
		System.out.println("-------------------------------------------");
		an = new Dog();
		test(an);
	}

}
