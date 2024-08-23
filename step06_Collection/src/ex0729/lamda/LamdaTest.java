package ex0729.lamda;

public class LamdaTest {

	public static void main(String[] args) {
		//1. 기존코딩
		/*AInterface ai = new Test();
		ai.aa();*/
		
		//2. Anonymous Inner type변경
		/*AInterface au = new AInterface() {
			
			@Override
			public void aa() {
				System.out.println("inner aa() call");
				
			}
		};
		au.aa();*/
		
		//3. 람다식
		AInterface ai3 = ()->System.out.println("람다 aa() call");
		ai3.aa();
		
		System.out.println("--------------------");
		BInterface bi = (i)->System.out.println("인수의 값: " +i);
		
		bi.bb(5);
		bi.bb(15);
		
		
		System.out.println("--------------------");
		//CInterface ci = (i,j)->i*j;
		//CInterface ci = (i,j)->{return i*j;};
		CInterface ci = (i,j)->{
			System.out.println("i와 j를 곱합니다");
			return i*j;
		};
		
		int result = ci.cc(15, 3);
		System.out.println("결과: "+result);
	}

}
class Test implements AInterface{

	@Override
	public void aa() {
		System.out.println("aa 호출됨");
		
	}
	
}
