package ex0725;

import java.io.IOException;

public class ThrowExam {
	/**
	 * 인수의 값은 음수가 들어올 수 없다
	 * @param i
	 */
	public void aa(int i) throws IllegalArgumentException, IOException{
		if(i<0) {
			//강제로 예외처리하고 싶다!
			IllegalArgumentException ia = new IllegalArgumentException("음수는 안됩니다!");
			throw ia;
		}
		//i의 값이 100이면 안된다!
		
		if(i == 100) {
			throw new IOException("100은 안됩니다!");
		}
		System.out.println("전달된 i = "+ i);
	}
	public static void main(String[] args) {
		System.out.println("----------------메인 시작-----------------");
		try {
			new ThrowExam().aa(100);
		}
		catch(IllegalArgumentException | IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------------메인 끝-----------------");
	}

}
