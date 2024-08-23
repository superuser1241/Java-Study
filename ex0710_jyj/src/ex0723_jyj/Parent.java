package ex0723_jyj;

public class Parent {
	public String name;
	
	public Parent() {//무조건 기본생성자를 작성하고 시작하는게 좋다
		
	}
	
	public Parent(String name) {
		this.name = name;
	}
}
class Child extends Parent{
	public int studentNo;
	
	
	public Child(String name, int studentNo) {
		this.name = name;
		this.studentNo =studentNo;
	}
}
