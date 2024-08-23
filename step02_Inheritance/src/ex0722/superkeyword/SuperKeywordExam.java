package ex0722.superkeyword;

class Animal{
	int age=5;
	String bodyColor;//부모에만 있는 필드명
	
	public void sound() {
		System.out.println("어흥");
	}
	public void run() {
		System.out.println("잘 뛴다");
	}
}

class Cat extends Animal{
	int age= 2;//부모필드명과 중복
	int weight;//자식에만 있는 필드명
	
	public void test() {
		System.out.println(age);//2
		System.out.println(this.age);//2
		System.out.println(super.age);//5
		System.out.println("----------------------------------------");
		System.out.println(weight);
		System.out.println(this.weight);
		//System.out.println(super.weight);//부모에 필드명이 없기때문에 접근불가
		System.out.println("----------------------------------------");
		System.out.println(bodyColor);
		System.out.println(this.bodyColor);
		System.out.println(super.bodyColor);
		
		System.out.println("----------메소드 호출--------------");
		sound();//야옹
		this.sound();//야옹
		super.sound();//어흥
		
		System.out.println("------------------------------------------");
		clim();
		this.clim();
		//super.clim();
		
		System.out.println("------------------------------------------");
		run();
		this.run();
		super.run();
		
	}
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	public void clim() {
		System.out.println("고양이는 잘 올라간다");
	}
}

public class SuperKeywordExam {

	public static void main(String[] args) {
		//new Cat().test();
		Cat cat = new Cat();
		System.out.println("----------필드 접근--------------");
		System.out.println(cat.age);
		System.out.println(cat.weight);
		System.out.println(cat.bodyColor);
		System.out.println("----------메소드 접근--------------");
		cat.sound();
		cat.run();
		cat.clim();
		
		Animal an = new Cat();
		System.out.println("----------필드 접근--------------");
		System.out.println(an.age);
		//System.out.println(an.weight);//부모타입 변수로는 자식부분 접근불가
		System.out.println(an.bodyColor);
		System.out.println("----------메소드 접근--------------");
		an.sound();  //재정의된 메소드는 자식부분에서 접근가능!!!!!!
		an.run();
		//an.clim();//부모타입 변수로는 자식부분 접근불가
		if(an instanceof Cat) {
			Cat c = (Cat)an;
			System.out.println(c);
			System.out.println(c.weight);
			c.clim();
		}
	}
}
