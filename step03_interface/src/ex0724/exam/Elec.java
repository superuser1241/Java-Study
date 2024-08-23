package ex0724.exam;

public class Elec {
	private String code;
	private int cost;
	
	
	public Elec() {}
	public Elec(String code, int cost) {
		super();
		this.code = code;
		this.cost = cost;
	}
	
	
	@Override
	public String toString() {
		return "Elec [code=" + code + ", cost=" + cost + "]";
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
