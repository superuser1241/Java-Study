package sample02;

public class PartTime extends Employee {
	private int timePay;

	public PartTime() {
		
	}
	public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.timePay = timePay;
	}
	

	@Override
	public String toString() {
		return super.toString()+"PartTime [timePay=" + timePay + "]";
	}
	
	@Override
	public void message() {
		System.out.println(geteName() + " 비정규직입니다");
	}
	
	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
	

}