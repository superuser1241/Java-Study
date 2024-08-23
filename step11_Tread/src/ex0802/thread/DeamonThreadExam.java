package ex0802.thread;

public class DeamonThreadExam {
	
	public static void main(String[] args) {
		System.out.println("--------------------main 시작---------------------");
		
		Thread th = new Thread(()->{
				while(true) {
					System.out.println("점심 뭐 먹지?");
					
			}
		});
		th.setDaemon(true);  //main Thread가 종료되면 함께 종료한다 
		th.start();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------main 끝---------------------");
	}

}
