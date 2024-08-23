package sample03;

public class FullTime extends Employee {
	private int salary;
	private int bonus;
	
	public FullTime() {}
	public FullTime(int empno, String eName, String job, int mgr, String hiredate, String deptno, int salary, int bonus) {
		super(empno, eName, job, mgr, hiredate, deptno);
		this.salary=salary;
		this.bonus=bonus;
	}
	public int getSalary() {
		return salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("FullTime [salary=");
		builder.append(salary);
		builder.append(", bonus=");
		builder.append(bonus);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public void message() {
		System.out.println(geteName()+"사원은 정규직입니다");
		
	}
	
}
