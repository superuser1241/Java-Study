package ex0723.final_abstract;
//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam{//상속불가, 생성가능
 final int i = -999999; //값 변경 불가, 고정값, 반드시 초기화 필수
}


abstract class AbstractClassExam{//상속필수, 생성 불가
    abstract String abstractMethodExam(int i,String s);    //기능없고 재정의가 필요
    final int finalMethodExam(int i, int j){ //재정의 불가
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	/*int finalMethodExam(int i, int j){
		return i*j;
	}*/ //재정의 불가
	
}

//class Sample02 extends FinalClassExam{  }//상속 불가


 
abstract class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(int i,String s){
		return s+i;
	 }
	String abstractMethodExam(String s, int i) {
		return "";
	}

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
		//AbstractClassExam ace = new AbstractClassExam();  //생성불가
		FinalClassExam fce = new FinalClassExam();
		//fce.i=100000; //값 변경 불가
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
