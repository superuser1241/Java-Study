package ex0710.제어문;

public class SwitchExam02 {

	public static void main(String[] args) {
		//1~12난수 발생
		int num = (int)(Math.random()*12)+1;
		int endDay;
		/*
		switch(num) {
		case 2 : endDay =28; break;
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 : endDay =30; break;
		default : endDay=31;
		}
		
		endDay = switch(num) {
		case 2 -> 28;
		case 4,6,9,11 ->{
			yield 30;
		}
		default ->31;
		};
		
		System.out.println(num+"월은"+endDay+"일 까지 입니다");
		*/
		//////////////////////////////////////////////////////////////////
		//switch 문을 if 문으로
		
		if(num==2) {
			endDay=28;
		}
		else if(num == 4 || num ==6 || num ==9 || num==11) {
			endDay=30;
		}
		else {
			endDay = 31;
		}
		System.out.println(num+"월은"+endDay+"일 까지 입니다");
	}

}