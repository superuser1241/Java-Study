package ex0729.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

import org.xml.sax.InputSource;

public class PropertiesExam {
	Properties pro = new Properties();//Map의 구조인 Hashtable 상속받음
	public PropertiesExam() {
		//저장
		pro.setProperty("name", "영준");
		pro.setProperty("age", "20");
		pro.setProperty("addr", "서울");
		
		//조회
		for(String key :pro.stringPropertyNames()) {
			String value = pro.getProperty(key);
			pro.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}
	/**
	 * 외부의 ~.properties 파일 로딩하는 방법
	 * 1) IO를 이용하는 방법
	 * 2) ResourceBundle 방법
	 */
	
	//1) IO를 이용하는 방법
	public void test01() {
		pro.clear();
		
		try {
			//pro.load(new FileInputStream("src/ex0729/map/dbInfo.properties"));
			
			//2. 클래스 위치한 패키지 내에서 파일 로딩할 때 / 생략(상대경로)
			/*InputStream inputstream = this.getClass().getResourceAsStream("dbInfo.properties");
			pro.load(inputstream);*/
			
			//3. 클래스로더의 모든 경로에서  파일 읽음 . 보통 resources 폴더의 파일 읽을 때 사용
			/*InputStream inputstream = this.getClass().getClassLoader().getResourceAsStream("a.properties");
			pro.load(inputstream);*/
			
			//클래스로더의 class 내에 파일이 존재하는 경우
			InputStream inputstream = this.getClass().getClassLoader().getResourceAsStream("ex0726/list/b.properties");
			pro.load(inputstream);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		//조회
		for(String key :pro.stringPropertyNames()) {
			String value = pro.getProperty(key);
			pro.getProperty(key);
			System.out.println(key + " = " + value);
		}
		System.out.println();
	}
	
	//2) ResourceBundle 방법
	public void test02() {
		/**
		 * ResourceBundle은 ~.properties파일을 로딩하는 전용 클래스로
		 * 파일의 확장자는 생략한다
		 *  기준 경로가 classes폴더를 기준으로 한다.
		 */
		ResourceBundle rb = ResourceBundle.getBundle("ex0729/map/dbInfo");
		for(String key :rb.keySet()) {
			String value = rb.getString(key);
			System.out.println(key + " | " + value);
		}
	}
	
	public static void main(String[] args) {
		new PropertiesExam().test01();
		new PropertiesExam().test02();
	}

}




