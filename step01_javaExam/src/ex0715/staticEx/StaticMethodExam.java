package ex0715.staticEx;

public class StaticMethodExam {
	
	int a=5;
	static int b=10;
	
	public void aa() {
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(StaticMethodExam.b);
		
		//메소드 호출
		bb();
		this.bb();
		
		dd();
		this.dd();
		StaticMethodExam.dd();
	}
	
	public void bb() {
		
	}
	
	public static void cc() {
		//System.out.println(a);         //non-static 접근불가, this 키워드 사용불가
		//System.out.println(this.a);
		
		System.out.println(b);
		//System.out.println(this.b);
		System.out.println(StaticMethodExam.b);
		
		//bb();
		//this.bb();
		
		dd();
		//this.dd();
		StaticMethodExam.dd();
	}
	
	public static void dd() {
		
	}

	
	public static void main(String[] args) {
		dd();
		//aa(); non-static은 사용불가

	}

}
