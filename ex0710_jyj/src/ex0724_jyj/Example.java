package ex0724_jyj;
class B implements A{

	@Override
	public void method1() {
		System.out.println("B-method1()");
		
	}
	
}
class C implements A{

	@Override
	public void method1() {
		System.out.println("C-method1()");
		
	}
	public void method2() {
		System.out.println("C-method2()");
		
	}
	
}

public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {//Java 14부터 instanceof의 결과가 true일때 지금과 같이 강제타입변환 필요없음
			c.method2();
		}
	}

	public static void main(String[] args) {
		action(new B());
		action(new C());

	}

}
