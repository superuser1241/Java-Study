package ex0725;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("-----------메인 시작----------------");
		System.out.println("args= "+ args);
		
		try {
			//예외 가능성 코드 작성
			String param = args[0];
			System.out.println("Param = "+ param);
			
			//String --> int 변환
			int convertNo = Integer.parseInt(param);
			System.out.println("convertNo = "+ convertNo);
			
			int result = 100/ convertNo;                         //ArithmeticException 예외 가능성(0으로 나눌 때)
			System.out.println("나눈 결과 : "+ result);
		}
		catch(Exception e){
			//예외 발생했을 때 해야 할 일 작성
			System.out.println("e = " + e);
		}
		finally {
			System.out.println("예외 발생여부 상관없이 무조건 실행");
		}
		
		
		System.out.println("-------------메인 끝 ----------------");
	}

}
