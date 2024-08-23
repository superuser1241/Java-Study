package ex0717.array;

public class MultiArrayExam {
	//int [] [] arr  = new int [3] [4];
	/*int [] [] arr = new int [] [] {
		{1,2,3},
		{2,4,6,8,10},
		{10},
		{10,20},
		{3,6,9}
	};*/
	
	int [] [] arr = new int [3] [];
	
	
	public void test() {
		//각 행마다 열의 개수를 생성
		arr[0] = new int [3];
		arr[1] = new int [5];
		arr[2] = new int [] {1,2,3,4,5,6,7};
		
		
		
		System.out.println("arr = "+ arr);
		System.out.println("arr.length = "+ arr.length);       //2차원 배열의 길이는 행의 길이를 의미한다
		System.out.println("arr[0].length = "+ arr[0].length);   //1행의 열 길이
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0 ; j<arr[i].length;  j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MultiArrayExam mae = new MultiArrayExam();
		mae.test();
		
		//new MultiArrayExam().test();  //생성과 동시에 호출하는건데 1회성이다 ★
		
	}

}
