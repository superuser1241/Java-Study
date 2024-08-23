package ex0725.exception;

import java.util.Random;

class AgeException extends Exception {
	public static int count =0;
	
	public AgeException() {
		super("애들은 가라");
		count++;
	}
	public AgeException(String message) {
		super(message);
		count++;
	}
}

class Shopping{
	public void age(int i) throws AgeException{
			if(i<18) {
				//예외발생
				throw new AgeException(i+"살은 입장할수 없습니다!");
			}
			System.out.println(i+ "살은 입장을 환영합니다");
	}
}

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("-----------------ShoppingMall 오픈-----------------");
		Shopping sh = new Shopping();
		//int a = (int)(Math.random()*55)+1;
		Random random = new Random();
		
		for(int i =1; i<=10;i++) {
			int age = random.nextInt(55)+1;
			try {
				sh.age(age);
			}
			catch(AgeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println();
			
		}
		System.out.println("예외 발생한 손님: "+AgeException.count +"명");
	}
}
