package sample01;

public class MainApp {

	   /**
	    * @param args
	    */
	   public static void main(String[] args) {
	      
	      FullTime [] full = new FullTime[3];
	      PartTime [] part = new PartTime[2];
	      
	      int fullCount = 0;
	      int partCount = 0;

	      
	      full[fullCount++] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
	      full[fullCount++] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
	      full[fullCount++] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
	      
	      part[partCount++] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
	      part[partCount++] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
	      
	      
	      //출력화면을 보고 코딩...
	      
	   }
	}
