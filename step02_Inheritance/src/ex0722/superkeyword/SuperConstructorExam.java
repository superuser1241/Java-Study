package ex0722.superkeyword;

class Parent{
	/*Parent(){
		System.out.println(1);
	}*/
	Parent(int i){
		System.out.println(2);
	}
	Parent(String s){
		System.out.println(3);
	}
}
class Child extends Parent{//Child는 Parent이다
	Child(){
		this(4);
		System.out.println(4);
	}
	Child(int i){
		this(true);
		System.out.println(5);
	}
	Child(boolean b){
		super("Hi");
		System.out.println(6);
	}
}

public class SuperConstructorExam {

	public static void main(String[] args) {
		//new Child();//1,4
		//new Child(5);//1,5
		//new Child(true);//1,6
		
		//만약 부모생성자 1,2,3이 없다면?
		//new Child();//4
		//new Child(5);//5
		//new Child(true);//6
		
		//만약 부모 생성자에 1은 없고 2,3만 있다면?
		new Child();//2,4
		new Child(5);//2,5
		new Child(true);//3,6
	}

}
