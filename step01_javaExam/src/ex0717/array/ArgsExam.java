package ex0717.array;

public class ArgsExam {

	public static void main(String[] args) {
		System.out.println("args= "+ args);
		System.out.println("args.length = "+ args.length);
		int sum = 0;
		for(int i = 0; i< args.length; i++) {
			sum+=Integer.parseInt(args[i]);
			System.out.print(args[i]+" ");
		}
		System.out.println();
		System.out.println(sum);
	}
}

/**
 * 실행
 * Java 파일 이름 값 값 값 값 .....
 * 
 * ex)
 * java ArgsExamd
 * */
