package ex0717.array;

class MultiArray{
	//정수형 2차원 배열 8*9
	int arr[][] = new int [8][9];
		
	//메소드이름 :array99
		
		//for loop 를 사용하여 
		//배열에 곱한 (구구단)결과저장
		//배열에 결과를 꺼내출력
	public void array99() {
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) { 
				arr[i][j] = (i+2)*(j+1);
				System.out.print((i+2)+"x"+(j+1)+"="+arr[i][j]+"\t");
			}
			System.out.println();
			System.out.println();
		}
	}
		
			
			
	}
	public class MemoryApart{
	//main메소드에서 
		public static void main (String [] args) {
			//MultiArray객체의 array99메소드호출
			MultiArray ma= new MultiArray();
			ma.array99();
		}
	}


