package ex0719.contsructor.student;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)
 * */
public class StudentService {
	private Student [] stArr = new Student [10]; 
	public static int count;    //배열에 저장된 객체의 개수를 체크하는 변수
	/**
	 * 초기치데이터 3명 정도 세팅하기 
	 * */
	public  StudentService() {
		stArr[StudentService.count++] = this.create("영준",26,"분당");
		stArr[StudentService.count++] = this.create("영",25,"서울");
		stArr[StudentService.count++] = this.create("준",24,"부산");
	}
	
	/**
	 *  Student객체를 생성해서 리턴해주는 메소드 작성
	 * */
	 private Student create(String name, int age, String addr) {
		 Student st1 = new Student(name,age,addr);
		 return st1;
	 }
	
	

	 /**
	   학생의 정보 등록하기 
	    : 배열의 길이를 벗어났는지 체크 =-1
	    : 이름이 중복인지 체크 = 0
	    : 유효성 체크가 완료되면 등록한다. =1
	      @return:-1이면 길이제한, 0이면 이름중복, 1이면 성공
	  **/
	 public int insert(Student student){
		 //정보를 더 저장할 수 있는지 체크
		 if(count == stArr.length) {
			 return -1;
		 }
		 //이름이 중복인지 체크
		 Student searchedStudent = this.selectByName(student.getName());
		 if(searchedStudent !=null) {
			 return 0;
		 }
		 
		 //유효성 체크가 완료되면 등록
		 stArr[count++] = student;
		 return 1;
	 }
	 
	
	/**
	 * 전체 학생의 정보 조회하기
	 * */
	 public Student []  selectAll() {
		 //기능
		 System.out.println(stArr);
		 //리턴
		 return stArr;
	 }
	
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 *  : 이름에 해당하는 학생이 있으면 학생의 이름, 나이, 주소를출력하고
	 *     없으면 "찾는정보가 없습니다." 출력한다.
	 *     이름은 중복안됨
	 *     찾으면 객체를 리턴하고 못찾으면 null리턴
	 * */
	 public Student selectByName(String name) {
		 for(int i = 0; i<count; i++) {
			 Student st = stArr[i];
			 if(st.getName().equals(name)) {
				 return st;
			 }
		 }
		 return null;
	 }
	
	
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기 
	 *  : 이름에 해당하는 정보가 없으면 수정 불가 = 0
	 *  : 정보가 있으면 수정하고 1을 리턴
	 * */
	 public int update(Student student) {
		 //전달된 정보에서 이름을 꺼내어 배열에 있는 학생인지 체크하고
		 //있으면 수정, 없으면 0 리턴
		 Student searchedSt = this.selectByName(student.getName());
		 if(searchedSt == null) {
			 return 0;
		 }
		 searchedSt.setAge(student.getAge());
		 searchedSt.setAddr(student.getAddr());
		 return 1;
	 }
}

