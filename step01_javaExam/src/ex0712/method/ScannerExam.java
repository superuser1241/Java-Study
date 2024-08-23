package ex0712.method;

import java.util.Random;
import java.util.Scanner; //Scanner라는 객체를 util폴더에 가져와주세요.

/**
    java.util.Scanner 는 사용자로 부터 키보드 입력을 타입별로 받을수 있도록 다양한 메소드를 제공한다.
	 1) 숫자를 입력받을때
          int i = 변수이름.nextInt(); // 개행문자(\n)무시 된다. 

	 2) 문자를 입력받을때
	    String data = 변수이름.next(); // 공백없는 입력값 , (개행문자(\n)무시

	 3) 문자열(공백포함) 입력받을때
	     String data = 변수이름.nextLine();// 공백을 포함 문자열 

*/
class  ScannerExam{
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수는 : ");
        int kor = sc.nextInt();  //(nextint는 키보드 입력을 기다릴 때 까지 뒷 부분을 진행하지 않음)

        System.out.print("영어 점수는 : ");
        int eng =  sc.nextInt(); 

        sc.nextLine();
        
		System.out.print("이름은 :");
		String name = sc.next();
		//String name = sc.nextLine();

		System.out.println("국어 : " + kor);
		System.out.println( "영어 : " + eng);
		System.out.println( "이름 : " + name);

		/////////////////////////////////////////////////



		/*System.out.print("국어점수는 : ");
		
		//String --> int형으로 형변환하는메소드 
        int kor = Integer.parseInt(sc.nextLine());

        System.out.print("영어 점수는 : ");
        int eng =  Integer.parseInt(sc.nextLine());

		System.out.print("이름은 :");
		String name = sc.nextLine();

		System.out.println("국어 : " + kor);
		System.out.println( "영어 : " + eng);
		System.out.println( "이름 : " + name);*/
	}
}






