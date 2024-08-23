package ex0731;

class Test implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("close() call");
		
	}
	
}
/////////////////////////////

public class AutoCloseableTest {
	
	public static void main(String[] args) {
		//Test t = new Test();
		
		try(Test t = new Test();){
			System.out.println("안녕");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("------------------End------------------");
	}

}
