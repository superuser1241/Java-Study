package ex0715.staticEx;

class Test{
	int a;               //전역변수
	static int b;
}

public class StaticVariableExam {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("t1="+t1);
		System.out.println("t2="+t2);
		System.out.println("t3="+t3);
		
		System.out.println("--------------non-static(변경 전)---------------");
		System.out.println("t1.a="+t1.a);
		System.out.println("t2.a="+t2.a);
		System.out.println("t3.a="+t3.a);
		
		//값 변경
		t1.a = 100;
		System.out.println("--------------non-static(변경 후)---------------");
		System.out.println("t1.a="+t1.a);
		System.out.println("t2.a="+t2.a);
		System.out.println("t3.a="+t3.a);
		
		System.out.println("--------------static(변경 전)---------------");
		System.out.println("t1.b="+t1.b);
		System.out.println("t2.b="+t2.b);
		System.out.println("t3.b="+t3.b);
		System.out.println("Test.b="+Test.b);         //이 문법 사용을 권장함
		
		//값 변경
		t1.b=200;
		System.out.println("--------------static(변경 후)---------------");
		System.out.println("t1.b="+t1.b);
		System.out.println("t2.b="+t2.b);
		System.out.println("t3.b="+t3.b);
		System.out.println("Test.b="+Test.b);

	}

}
