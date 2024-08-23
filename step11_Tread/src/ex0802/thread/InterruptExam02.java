package ex0802.thread;

public class InterruptExam02 {
	
	public static void main(String[] args) {
		System.out.println("--------------------main 시작---------------------");
		
		Thread th = new Thread(()->{
				while(true) {
					System.out.println("점심 뭐 먹지?");
					if(Thread.interrupted()) {
						break;
				}
			}
				System.out.println("Thread를 종료합니다");
		});
		th.start();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		th.interrupt();  //th Thread를 InterruptException을 발생시킨다.
		
		System.out.println("--------------------main 끝---------------------");
	}

}
