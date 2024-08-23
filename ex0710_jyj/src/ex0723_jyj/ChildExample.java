package ex0723_jyj;

class Parents{
	public String nation;
	
	public Parents() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parents(String nation) {
		this.nation= nation;
		System.out.println("Parent(String nation) call");
	}
}
class Childs extends Parents{
	public String name;
	
	public Childs() {
		this("홍길동");
		System.out.println("Child() call");
		}
	
	public Childs(String name) {
		this.name= name;
		System.out.println("Child(String name) call");
	}
}

public class ChildExample {

	public static void main(String[] args) {
		Childs childs = new Childs();
		
	}

}
