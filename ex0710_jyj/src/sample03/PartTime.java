package sample03;

public class PartTime extends Employee {
	private int timePay;
	
	public PartTime() {}
	public PartTime(int empno, String eName, String job, int mgr, String hiredate, String deptno,int timePay) {
		super(empno, eName, job, mgr, hiredate, deptno);
		this.timePay=timePay;
	}
	public int getTimePay() {
		return timePay;
	}
	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("PartTime [timePay=");
		builder.append(timePay);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public void message() {
		System.out.println(geteName()+"사원은 비정규직 입니다.");
	}
	
}
