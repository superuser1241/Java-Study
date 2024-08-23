package ex0719.contsructor.student;

/**
 * 결과를 출력하는 메소드를 제공
**/
public class StudentEndView {
	/**
	 * 전체검색
	 **/
	public static void printSelect(Student [] stArr) {
		System.out.println(stArr);
		
		System.out.println("학생 정보:"+StudentService.count+"명");
		for(int i =0; i<StudentService.count ; i++) {
			System.out.print("이름:"+stArr[i].getName()+"\t");
			System.out.print("나이:"+stArr[i].getAge()+"\t");
			System.out.print("주소:"+stArr[i].getAddr()+"\n");
		}
	}
	/**
	 * 조건 검색
	 */
	public static void printSearchName(Student student) {
		System.out.println("***"+student.getName()+"님 정보***");
		System.out.printf("나이:%d | 주소: %s%n", student.getAge(),student.getAddr());
	}
	
	/**
	 * 등록 or 수정 결과에 대한 메세지 출력
	 */
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
