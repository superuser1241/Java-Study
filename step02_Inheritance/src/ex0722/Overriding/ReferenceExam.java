package ex0722.Overriding;

class ObjectExam{
	String str;
	public ObjectExam(){   }
	public ObjectExam(String str){  
		this.str = str;
	}
	
	public String toString() {
		return super.toString()+" "+str;
	}
}

public class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="장희정"; 
			String s02="Java";
			
			String s03=new String("월요일");
			
			ObjectExam oe1=new ObjectExam();
			ObjectExam oe2=new ObjectExam("안녕");
			
			/**
			 * print(Object obj) or println(Object obj) 메소드는
			 * 전달된 인수 obj.toString() 메소드를 자동호출하고
			 * 그 메소드가 리턴한 값을 출력한다.
			 */
			System.out.println(c);//
			System.out.println(s01);//
			System.out.println(s02);//
			System.out.println(s03);//
			System.out.println(oe1);//
			System.out.println(oe2);//
	}
}
