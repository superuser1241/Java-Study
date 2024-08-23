package ex0710_jyj;

/*이름:주영준
 * 날짜:7월10일
 * 3번 슬라이드 난수발생 if 제어문*/

public class RandomIfExam01 {

	public static void main(String[] args) {
		String name = "주영준";
		int kor= (int)(Math.random()*56)+45;
		int eng= (int)(Math.random()*56)+45;
		int math= (int)(Math.random()*56)+45;
		int score = kor+eng+math;
		double avg = score/3.0;
		char grade;
		
		
		if(avg >= 90) {
			grade = 'A';
		}
		else if (avg >= 80) {
			grade ='B';
		}
		else if (avg >= 70) {
			grade = 'C';
		}
		else if (avg >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("이름:"+name+","+"국어점수:"+kor+","+"영어점수:"+eng+","+"수학점수:"+math+","+"총점:"+score+","+"평균:"+(int)(avg*100)/100.0+","+"학점:"+grade);

	}

}
