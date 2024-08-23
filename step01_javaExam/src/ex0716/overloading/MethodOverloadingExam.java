package ex0716.overloading;

//MethodOverloadingExam.java
class OverloadedMethod{
	private int i = 1 ;
	String s;
	char x;
	double y;
     
	public void  setOverload(int i){
		this.i = i;   //인수로 전달된 값을 전역필드에 저장해라
	}
	
	public int getOverload(){
		return i;     //전역필드의 값을 리턴해라
	}
	
	//setOverload를 Overloading하세요. 리턴도 하세요.
	public int setOverload(String s) {
		int x = 2;
		setOverload(x);
		System.out.println(i);
		return x;
	}
	
	//setOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	public int setOverload(char x) {
		int y = 3;
		setOverload(y);
		System.out.println(i);
		return y;
	}
	
	//setOverload를 또 또Overloading 하세요. 리턴 안해요
	public void setOverload(double y) {
		int z = 4;
		setOverload(z);
		System.out.println(i);
	}


	//getOverload를 Overloading하세요. 리턴도 하세요.
	public int getOverload(String s) {
		System.out.println(getOverload());
		return getOverload();
	}
	
	//getOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	public int getOverload(char x) {
		System.out.println(getOverload());
		return getOverload();
	}
	
	//getOverload를 또 또Overloading 하세요. 리턴 안해요
	public void getOverload(double y) {
		System.out.println(getOverload());
	}
	
}

class  MethodOverloadingExam{
     
public static void main(String [] agr){
   //OverloadedMethod객체에서 호출가능한  메소드들을 한번씩 호출하세요.
	OverloadedMethod olm = new OverloadedMethod();
	olm.setOverload("Hi");
	olm.setOverload('B');
	olm.setOverload(3.3);
	
	System.out.println();
	
	olm.getOverload("안녕");
	olm.getOverload('A');
	olm.getOverload(5.5);
	
	}   


}



