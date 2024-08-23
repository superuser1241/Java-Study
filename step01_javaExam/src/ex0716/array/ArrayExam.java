package ex0716.array;

class ArrayExam{
	
		//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
	int arr1 [] = new int [5];
	double arr2[] = new double[5];
	char arr3[] = new char[5];
	boolean arr4[] = new boolean[5];
	String arr5[] = new String[5];
	

		//메소드 : printArrayValue01	
		//위의 배열들에 자동으로 초기화 된값을 출력하세요
		public void printArrayValue01() {
			for(int i = 0; i<arr1.length; i++) {
				System.out.print(arr1[i]+" ");
			}
			System.out.println();
			
			for(int i = 0; i<arr2.length; i++) {
				System.out.print(arr2[i]+" ");
			}
			System.out.println();
			
			for(int i = 0; i<arr3.length; i++) {
				System.out.print(arr3[i]+" ");
			}
			System.out.println();
			
			for(int i = 0; i<arr4.length; i++) {
				System.out.print(arr4[i]+" ");
			}
			System.out.println();
			
			for(int i = 0; i<arr5.length; i++) {
				System.out.print(arr5[i]+" ");
			}
			System.out.println();
			System.out.println("----------------------------------");
		}

		//메소드 : printArrayValue02	
		//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
		public void printArrayValue02() {
			arr1= new int []{1,2,3,4,5};
			arr2 = new double[]{1.1 , 2.2, 3.3, 4.4, 5.5};
			arr3 = new char[]{'A','B','C','D','E'};
			arr4 = new boolean[] {true,true,true,true,true};
			arr5 = new String[]{"A","B","C","D","E"};
		}
		
		//메소드 : printArrayValue03	
		//새롭게 할당된값을 출력하세요
		public void printArrayValue03() {
			printArrayValue01();
		}
		
		//메인메소드에서
		//ArrayExam의 메소드들을 순서대로 호출하세요.
		public static void main(String [] args) {
			ArrayExam ae= new ArrayExam();
			ae.printArrayValue01();
			ae.printArrayValue02();
			ae.printArrayValue03();
		}
	
}