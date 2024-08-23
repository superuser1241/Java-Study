package ex0802.thread;

public class SynchronizedExam {
	
	public static void main(String[] args) {
		System.out.println("--------------------메인시작--------------------------------");
		
		//공유객체 생성
		Bank bank = new Bank(); 
		
		CustomerThread th1 = new CustomerThread(bank, "인출자", false);
		
		CustomerThread th2 = new CustomerThread(bank, "입금자", true);
		
		th1.start();
		th2.start();
		
		System.out.println("--------------------메인 끝--------------------------------");
	}

}
/**
 * 여러 쓰레드가 공유할 객체
 * */
class Bank{
	
	int balance =0;
	/**
	 * 
	 * @param : boolean state는 true이면 입금 false 이면 출금
	 * wait(), notifyAll()은 반드시 synchronized 블럭 안에서만 사용가능
	 * synchronized없이 사용하면 실행도중 IllegalMonitorStateException 발생
	 */
	public synchronized void balanceChange(String name, boolean state) {
		if(state) {// 입금자
			if(balance <1) {
				//synchronized (this) {  // this는 공유객체
				System.out.print(name+"==> 현재 잔액 확인: " + balance + ",");
				balance++;
				System.out.println(name+"==> 증가한 후 잔액 확인: " + balance);
			//}
			}
			else {
				System.out.println(name +"Thread wait() 중입니다");
				try {
					wait(); //현재 Thread를 정지상태
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
				
		}else {//인출자
			if(balance >=1) {
				//synchronized (this) {
				System.out.print(name+"==> 현재 잔액 확인: " + balance + ",");
				balance--;
				System.out.println(name+"==> 감소한 후 잔액 확인: " + balance);
			//}
			}else {
				System.out.println(name +"Thread wait() 중입니다");
				try {
					wait(); //현재 Thread를 정지상태
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		//wait()에 의해 정지상태인 Thread를 깨운다
		notifyAll();
		
	}//method 끝
}//class 끝
/////////////////////////////////////
/**
 * 고객 Thread
 */
class CustomerThread extends Thread{
	private Bank bank;
	private String name;
	private boolean state;
	
	public CustomerThread(Bank bank, String name, boolean state) {
		super(name); //Thread 이름 전달
		this.bank =bank;
		this.name =name;
		this.state = state;
	}
	@Override
	public void run() {
		//고객이 thread에서 해야할 일 작성
		for(int i =1; i<=50; i++) {
			bank.balanceChange(name, state);
		}
		System.out.println(super.getName()+"Thread 종료합니다");
		
	}
}


