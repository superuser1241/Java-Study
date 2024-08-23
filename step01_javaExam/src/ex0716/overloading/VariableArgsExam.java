package ex0716.overloading;

public class VariableArgsExam {
	
	public void test(int ...i) {
		System.out.println("i의 값:"+i);
		for(int index = 0; index<i.length; index++) {
			System.out.print(i[index]+"\t");
		}
		System.out.println();
		
	}
	public void test(String str, int ...i) {
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("---------호출--------");
		VariableArgsExam vae= new VariableArgsExam();
		vae.test(4);
		vae.test(5, 4);
		
		vae.test("A", 1,2,3,4);
		vae.test("B" , 2,23,4);
	}
}