package ex0723.final_abstract;

class Test {
	//int age;
	final int age;
	Test(int age){//생성자를 이용해서 final 필드 값 초기화
		this.age = age;
	}
	
	static final int count ;//상수이고 반드시 초기화 필수
	static {// static블럭에서 상수를 초기화한다
		 count = 100;
	}
}

public class FinalVsConstExam {
	public static void main(String[] args) {
		Test t = new Test(5);
		System.out.println(t.age);
		System.out.println(t.count);
		
		//t.age= 10; //값 변경 불가
		//System.out.println(t.age);
		
		Test t2 = new Test(20);
		System.out.println(t2.age);
		System.out.println(t2.count);
		
	}

}
