package ex0723_jyj;

public abstract class Machine {
	public void powerOn() {}
	public void PowerOff() {}
	public abstract void work();
}
class computer extends Machine{// abstract 클래스로 Machine 클래스가 선언 되었기때문에 abstract클래스로 상속
	public void work() {
		
	}
}
