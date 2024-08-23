package ex0802.thread;

public class InterruptExam {
	
	public static void main(String[] args) {
		System.out.println("--------------------main 시작---------------------");
		
		Thread th = new Thread(()->{
			try {
				while(true) {
					System.out.println("점심 뭐 먹지?");
					Thread.sleep(1); //0.001초 정지
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
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
