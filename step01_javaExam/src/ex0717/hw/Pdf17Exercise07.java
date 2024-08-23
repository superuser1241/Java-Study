package ex0717.hw;

public class Pdf17Exercise07 {

	public static void main(String[] args) {
		
		/* Java 실습화면.pdf
		 * 17 슬라이드 (교재 198p 확인문제 7번 동일)
		 * 주어진 배열의 항목에서 최대값을 구해보세요.(for문을 이용하세요). 
		 */
		int max = 0; //1
		int[] array = {1,5,3,8,30, 2,7 , 22};
		
		//작성 위치
		int len = array.length;
		
		for(int i=0; i< len ; i++) {
			if (array[i] > max) { //i = 0 1 2 3 4 5 ...
				max = array[i];
			}
		}
		System.out.println("max: "+max);
		
	}

}



