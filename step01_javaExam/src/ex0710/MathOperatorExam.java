package ex0710;

class MathOperatorExam{
	public static void main(String []args){
		int i=5;
		int j=2;
		System.out.println("i+j="+i+j);
		System.out.println("i-j="+(i-j));
		System.out.println("i*j="+(i*j));
		System.out.println("i/j="+(i/j));
		System.out.println("i%j="+(i%j));

		System.out.println("i="+i);
		
		int k=i++;
		System.out.println("k="+k);
		System.out.println("i="+i);
		
		int p=++i;
		System.out.println("p="+p);
		System.out.println("i="+i);

		int x=19 + 4 * 3 / 2 - 10 * 2 + 4;

		System.out.println("19+4*3/2-10*2+4="+x);
	}	
}