package ex0806.MultiChat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUIChatExam extends JFrame{
	JTextArea textArea = new JTextArea();
	JTextField textField = new JTextField();
	JScrollPane jsp = new JScrollPane(textArea);
	
	Socket sk;
	PrintWriter pw;
	BufferedReader br;
	
	public ClientGUIChatExam() {
		Container con = super.getContentPane();
		con.add(jsp, BorderLayout.CENTER);
		con.add(textField, BorderLayout.SOUTH);
		
		//옵션설정
		textArea.setFocusable(false);
		textArea.setBackground(Color.ORANGE);
		
		super.setSize(500,400);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//서버접속
		connection();
		
		//text박스에 값 입력 후 enter했을 때 이벤트  처리
		textField.addActionListener((e)->{
			//text박스의 값을 서버에 전송
			pw.println(textField.getText());
			
			//textField 지우기
			textField.setText("");
		});
		//서버가 보내오는 데이터를 읽는 Thread 처리
		new Thread(()->{
			String data = null;
			try {
				while((data = br.readLine()) !=null) {
					//textArea에 추가
					textArea.append(data+"\n");
					
					textArea.setCaretPosition(textArea.getText().length());
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}).start();
		
		
	}
	public void connection(){
		try {
			sk = new Socket("192.168.0.22",9000);
			br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			pw = new PrintWriter(sk.getOutputStream(),true);
			
			//대화명 창 띄운다
			String name = JOptionPane.showInputDialog(this,"대화명을 입력해주세요!!");
			pw.println(name); // 서버에게 대화명 전송
			
			super.setTitle("["+name+"]");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new ClientGUIChatExam();
	}

}
