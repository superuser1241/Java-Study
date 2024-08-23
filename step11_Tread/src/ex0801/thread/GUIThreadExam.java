package ex0801.thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.w3c.dom.Text;

public class GUIThreadExam extends JFrame {
	JTextField text1 = new JTextField(5);
	JTextField text2 = new JTextField(5);
	JButton btn = new JButton("눌러봐");
	
	public GUIThreadExam() {
		super("재미있다");
		//JFrame의 레이아웃 변경
		super.setLayout(new FlowLayout());
		
		//각 컴포넌트를 컨테이너 위에 추가
		Container con = super.getContentPane();
		con.add(text1);
		con.add(text2);
		con.add(btn);
		
		
		//창 크기
		super.setSize(500, 400);
		
		//정 중앙에 오도록
		super.setLocationRelativeTo(null);
		
		//보여줘
		super.setVisible(true);
		
		//창 닫기버튼을 눌렀을 때 모두 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//시계 동작
		new ClockThread().start();
		
		//1~1000까지 text위에 올린다
		/*new Thread(new Runnable() {
			
			@Override
			public void run() {
				
			}
		}).start();*/
		
		//람다식
		new Thread(()-> {
			//기능
			for(int i =1; i<=1000; i++) {
				text1.setText(i+" ");
				try {
					Thread.sleep(10);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		//버튼을 클릭했을 때 기능
		btn.addActionListener((e)->{
			//알파벳을 text2에 올린다.
			new Thread(()->{
				for(char ch ='A'; ch<='z'; ch++) {
					text2.setText(ch+" ");
					try {
						Thread.sleep(100);
					}catch(Exception ee) {
						ee.printStackTrace();
					}
				}
			}).start();
		});
		
	}// 생성자 끝
	
	
	
	
	
	public static void main(String[] args) {
		new GUIThreadExam();
	}

	class ClockThread extends Thread{

		@Override
		public void run() {
			while(true) {
				Calendar now = Calendar.getInstance();
				int y = now.get(Calendar.YEAR);//년
				int m = now.get(Calendar.MONTH)+1;//월
				int d = now.get(Calendar.DATE);//일
				
				int h =  now.get(Calendar.HOUR);//시
				int n = now.get(Calendar.MINUTE);//분
				int s = now.get(Calendar.SECOND);//초
				String time = y+"년"+m+"월"+d+"일"+h+"시"+n+"분"+s+"초";
				//setTitle("현재 시각:");
				GUIThreadExam.this.setTitle("현재 시각: "+ time);
				try {
					Thread.sleep(1000); // 1초 정지
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}//inner class 끝
}// 클래스 끝







