package ex0710_jyj;

/*이름:주영준
 * 날짜:7월10일
 * 연산자 예제 4번 나누기, 나머지 */

public class Exercise04 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수 
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		
		//남은 연필의 수
		int pencilsLeft = (pencils%students);
		System.out.println(pencilsLeft);
	}

}
