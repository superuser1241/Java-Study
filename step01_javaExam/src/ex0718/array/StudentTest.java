package ex0718.array;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("***학생 관리 프로그램 시작합니다.******");
		StudentService service = new StudentService();//StudentService의 전역변수들이 초기화 
		service.init(); // 초기치데이터 세팅
		
		//전체학생정보 출력
		Student [] studentArr = service.selectAll();
		System.out.println(studentArr);
		StudentEndView.printSelect(studentArr);
		
		//이름으로 검색하기
		System.out.println("이름으로 검색 -----");
		Student student = service.selectByName("영준");
		if(student == null) {
			StudentEndView.printMessage("찾는 정보가 없습니다");
		}
		else StudentEndView.printSearchName(student);
		
		
		System.out.println("등록하기 -----");
		student = new Student();
		student.setName("미미");
		student.setAge(25);
		student.setAddr("오리역");
		
		
		int result = service.insert(student);
		if(result == -1) {
			System.out.println("더 이상 추가할 수 없습니다");
		}
		else if(result == 0) {
			System.out.println("같은 이름이 있습니다");
		}
		else System.out.println("등록되었습니다");
		
		System.out.println(" 등록 완료 후 전체검색 ");
		Student [] arr = service.selectAll();
		StudentEndView.printSelect(arr);
		
		
		
		//수정하기 
		System.out.println("--4. 수정하기 -----");
		Student st2 =new Student();
		st2.setName("영준");//조건
		st2.setAge(23);
		st2.setAddr("대전");
		
		result = service.update(st2);
		if(result == 0) {
			System.out.println("이름이 잘못되어 수정할 수 없습니다");
		}
		else System.out.println("정보를 수정했습니다");
		
		System.out.println("------변경 후 --------");
		arr = service.selectAll();
		StudentEndView.printSelect(arr);
	}

}