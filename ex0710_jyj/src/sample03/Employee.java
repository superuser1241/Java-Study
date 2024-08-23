package sample03;

public abstract class Employee {
	private int empno;
	private String eName;
	private String job;
	private int mgr;
	private String hiredate;
	private String deptno;
	
	public Employee() {}
	public Employee(int empno, String eName, String job, int mgr, String hiredate, String deptno) {
		super();
		this.empno = empno;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.deptno = deptno;
	}
	public int getEmpno() {
		return empno;
	}
	public String geteName() {
		return eName;
	}
	public String getJob() {
		return job;
	}
	public int getMgr() {
		return mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empno=");
		builder.append(empno);
		builder.append(", eName=");
		builder.append(eName);
		builder.append(", job=");
		builder.append(job);
		builder.append(", mgr=");
		builder.append(mgr);
		builder.append(", hiredate=");
		builder.append(hiredate);
		builder.append(", deptno=");
		builder.append(deptno);
		builder.append("]");
		return builder.toString();
	}
	public abstract void message();
}
