package ex0725;

class Test{
	public void aa(int i) throws ArithmeticException, NullPointerException{
		System.out.println("aa 호출 됨");
		try {
			this.bb(i);
		}
		finally {
			System.out.println("aa 호출 끝");
		} 
		
	}
	public void bb(int i) throws ArithmeticException, NullPointerException{
		try {
			System.out.println("bb 호출 됨");
			int result = 100/i;  //ArithmeticException 가능성
			System.out.println("결과: "+ result);
		}
		finally {
			System.out.println("bb 호출 끝");
		}
	}
}

public class ThrowsExam {
	public static void main(String[] args) {
		System.out.println("----------메인시작-------------------");
		try {
			new Test().aa(10);
		}
		catch(ArithmeticException | NullPointerException e) {
			System.out.println("0은 입력할 수 없습니다");
		}
		
		
		System.out.println("----------메인 끝 ---------------------");
		
	}

}
