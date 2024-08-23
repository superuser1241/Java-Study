package ex0715.staticEx;// package 선언은 반드시 문서 첫줄, 한개만 작성가능

public class StaticInitExam {
	//필드, 생성자, 메소드 구성
	int a;
	static int b;
	
	//생성자
	public StaticInitExam() {
		a=50;
		b=100;
	}
	
	/**
	 * static 블럭
	 * : main보다 먼저 실행된다.
	 * : 환경구축을 위한 설정정보를 로딩하고 세팅하는 과정
	 *   데이터를 로딩해서 초기화작업(ex) DB로드, 연결...)
	 */
	static {
		System.out.println("------------static 시작-----------");
		b= 100;
		//static 블록에서 인스턴스필드는 접근 불가하기 때문에 int a는 초기화 불가능
	}

	public static void main(String[] args) {
		System.out.println("------메인시작--------");

	}

}
