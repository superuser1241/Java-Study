package ex0719.contsructor;
/**
 * 싱글톤 클래스 작성
 * 1) private 생성자를 만든다
 * 2) static 멤버 필드를 이용해서 객체를 생성
 * 3) 객체를 생성해서 리턴하는 메소드 제공
 */




class Test{
	static Test instance = new Test();
	int age;
	private Test() {// 외부에서 객체생성 불가
		
	}
	public void aa() {
		
	}
	
	public static Test getInstance() {
		return instance;
	}
}
public class PrivateConstructorExam {

	public static void main(String[] args) {
		// new Test(); private 생성자이므로 생성 불가
		
		//제공된 메소드를 호출해서 Test 객체를 얻는다
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		
		System.out.println("t1:"+ t1);
		System.out.println("t2:"+ t2);
	}

}
