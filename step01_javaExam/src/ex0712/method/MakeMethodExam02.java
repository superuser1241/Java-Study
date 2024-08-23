package ex0712.method;

class MakeMethodExam02{
	

/*	
	Method이름 : methodExam02_01
	자기자신만 접근가능
	Return Type : 정수
	Parameter : 정수2개	
	(구현부에서)하는일 : 인수로 받은(들어온) 두개의 정수의 합을 출력하고
		두정수의 합이 3의 배수이면 "3의 배수"출력
		두정수의 합 리턴
*/
	private int methodExam02_01(int x, int y) {
		int z = x+y;
		System.out.println(z);
		if(z%3==0) {
			System.out.println(z);
		}
		return z;
	}
	

/*	Method이름 : methodExam02_02
	어디서나 아무나 접근
	Return Type : String
	Parameter : String	
	(구현부에서)하는일 : 인수로 받은(들어온) String에 바보를 붙여서 출력
			     인수로 받은 (들어온)String에 바보를 붙여서 리턴
*/
	public String methodExam02_02(String str) {
		String str1 = str+"바보";
		System.out.println(str1);
		return str1;
	}
	
/*	
	Method이름 : methodExam02_03
	같은 package에서 아무나 접근가능
	Return Type : 리턴안합
	Parameter : 정수1개 와 String 1개	
	(구현부에서)하는일 : 인수로 받은 정수와 String을 (하나의 String으로) 붙여서 출력
		인수로 받은정수가 4의 배수라면 1출력, 아니라면 0출력
*/
	void methodExam02_03(int x, String str) {
		String str1 = x +str;
		System.out.println(str1);
		if(x%4==0) {
			System.out.println(1);
		}
		else System.out.println(0);
	}
	
/*	
	Method이름 : methodExam02_04
	상속관계라면 어디서나 접근가능
	Return Type : 실수(부동소수형)
	Parameter :첫번째인수(정수),두번째 인수(실수),세번째 인수(정수)	
	(구현부에서)하는일 : 첫번째 인수 곱하기 두번째인수 빼기 세번째인수 결과 출력
			     위의 결과를 리턴
*/
	protected double methodExam02_04(int x, double z, int y) {
		double a = (x*z)-y;
		System.out.println(a);
		return a;
	}
	

	public static void main(String [] args){
      MakeMethodExam02 mme = new MakeMethodExam02();
		int k=mme.methodExam02_01(33, 22);
		System.out.println(k);
       		String s=mme.methodExam02_02("장희정");
		System.out.println(s);
       		mme.methodExam02_03(42, "이뿌니~");
       		//double d=mme.methodExam02_04(7, 5.5, 8);
		System.out.println(mme.methodExam02_04(7, 5.5, 8));
	}	
}
