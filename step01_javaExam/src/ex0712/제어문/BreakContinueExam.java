package ex0712.제어문;

public class BreakContinueExam {

	public static void main(String[] args) {
		for(int a =1; a<=10; a++) {
			//if(a==5)break;
			//if(a==5)continue;
			
			//if(a>5)break;
			//if(a>5)continue;
			System.out.print(a+" ");
		}
		
		System.out.println("\n 이중 반복문 --------");
		System.out.println();
		
		outer:  //라벨
		for(int i =1; i<=5; i++) { //5행
			for(int j =1; j<=3; j++) {//3열
				//if(j==2)break;// 자신을 감싸고 있는 블록만 빠져나감
				//if(j==2)continue; //조건만 빼고 다찍힘
				
				if(j==2)break outer; //밖으로 바로 빠져나감
				
				//if(i==2)break; //i의 2열 빼고 다 찍힘
				//if(i==2)continue;
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//5단 빼고 출력
		for(int i = 2; i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i==5)continue;
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		//5단까지만 출력
		outer:
		for(int i = 2; i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i==6)break outer;
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println();
		}

	}

}
