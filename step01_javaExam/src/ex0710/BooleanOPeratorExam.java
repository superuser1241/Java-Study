package ex0710;

class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean  t=true ;
		boolean f=false;
		System.out.println("true&false="+(t&f));
		System.out.println("true&true="+(t&t));
		System.out.println("false&false="+(f&f));
		System.out.println();
	
		System.out.println("true|false="+(t|f));
		System.out.println("true|true="+(t|t));
		System.out.println("false|false="+(f|f));
		System.out.println();

		System.out.println("true^false="+(t^f));
		System.out.println("true^true="+(t^t));
		System.out.println("true^false="+(t^f));
		System.out.println("true^true="+(t^t));
		System.out.println();

		System.out.println("true&&false="+(t&&f));
		System.out.println("true&&true="+(t&&t));
		System.out.println("true&&false="+(t&&f));
		System.out.println("false&&false="+(f&&f));
		System.out.println();

		System.out.println("true||false="+(t||f));
		System.out.println("true||true="+(t||t));
		System.out.println("false||false="+(f||f));
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i="+i+"\tint j="+j);
		System.out.println("i>=j==>>"+(i>=j));
		System.out.println("i>j=>>"+(i>j));
		System.out.println("i<=j=>>"+(i<=j));
		System.out.println("i<j=>>"+(i<j));
		System.out.println("i==j=>>"+(i==j));
		System.out.println("i!=j=>>"+(i != j));
		
		System.out.println(true | test());
		System.out.println(true || test());
	}
	public static boolean test() {
		System.out.println("test메소드 호출");
		return false;
	}
	}