package ex0729.set;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam extends HashSet<Member>{
	//Set<Member> set = new HashSet<Member>();
	
	
	public MemberSetExam() {
		/**
		 * Set은 중복을 체크하기 위해서
		 * hashcode()를 호출하고 다르면 중복x
		 * 같으면 -> equals() 호출해서 false이면 중복아님
		 * 												true이면 같은 객체인걸로 판단
		 */
		//추가
		super.add(new Member("주영준", 22, "서울"));
		super.add(new Member("주영준", 22, "성남"));
		super.add(new Member("주영준", 22, "분당"));
		
		System.out.println("저장된 개수: "+ super.size());
		
	}
	public static void main(String[] args) {
		new MemberSetExam();

	}

}
