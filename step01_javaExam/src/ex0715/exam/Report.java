package ex0715.exam;

public class Report {
	//총점
	private int calcTotal(int x, int y, int z) {
		return x+y+z;
	}
	//평균
	private double calcAvg(int total, double x) {
		return (double)total/x;
	}
	//등급
	private char calcGrade(double avg) {
		if(avg>=90) {
			return 'A';
		}
		else if(avg>=80) {
			return 'B';
		}
		else if(avg>=70) {
			return 'C';
		}
		else if(avg>=60) {
			return 'D';
		}
		else return 'F';
	}
	//출력 메소드
	public void result(String name, int kor, int eng, int math) {
		int total = calcTotal(kor, eng, math);
		double average = calcAvg(total,3);
		char grade = calcGrade((double) average);
		
		System.out.println("이름:"+name);
		System.out.println("총점:"+total);
		System.out.println("평균:"+average);
		System.out.println("학점:"+grade);
	}
	

}
