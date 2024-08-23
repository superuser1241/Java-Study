package ex0801.thread;

public class ThreadExam {
	
	public static void main(String[] args) { // main도 하나의 Thread라고 한다!!
		System.out.println("----------------main 시작합니다-------------------");
		NumberTread th1 = new NumberTread("첫번째 Thread");
		NumberTread th2 = new NumberTread("두번째 Thread");
		Thread th3 = new Thread(new AlphaThread(),"세번째 Thread");
		
		//Thread를 준비 = 대기상태
		th1.start();
		th2.start();
		th3.start();
		
		//th1.run();       //싱글Thread
		//th2.run();
		//th3.run();
		
		/*try {
			th1.join();  //th1 Thread가 종료될때까지 현재 스레드 중지
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		
		
		System.out.println("총합은?: "+th1.sum);
		System.out.println("----------------main 끝 입니다-------------------");
	}

}
/////////////////////////////////////////////////
/**
 * 1~100출력하는 Thread - 상속
 */
class NumberTread extends Thread{
	int sum;
	public NumberTread(String name) {
		super(name);
	}
	@Override
	public void run() {
		
		for(int i =0; i<=100; i++) {
			System.out.println(super.getName()+"-->"+ i );
			sum +=i;
			try {
				//Thread.sleep(100);
				Thread.yield();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(super.getName()+"종료합니다");
	}
	
}

/**
 * A~Z 출력하는 Tread - 구현
 */
class AlphaThread implements Runnable{

	@Override
	public void run() {
		//현재 동작하고있는 Thread 객체 가져오기
		Thread th = Thread.currentThread();
		for(char ch= 'A'; ch<='z'; ch++) {
			System.out.println(th.getName()+"-->"+ch);
			try {
				//Thread.sleep(100);
				Thread.yield();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(th.getName()+"종료합니다");
	}
}
