package ex0723_jyj;

public class Activity {
	public void onCreate() {
		System.out.println("기본적인 실행 내용");
	}
}
class MainActiivity extends Activity{

	@Override
	public void onCreate() {
		super.onCreate();//super
		System.out.println("추가적인 실행 내용");
	}
	
}
