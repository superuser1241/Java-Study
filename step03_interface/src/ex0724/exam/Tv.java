package ex0724.exam;

public class Tv extends Elec implements ElecFunction {
	private int chnnel;
	

	public Tv() {}

	public Tv(int chnnel) {
		super();
		this.chnnel = chnnel;
	}
	public Tv(String code, int cost, int chnnel) {
		super(code, cost);
		this.chnnel = chnnel;
	}
	
	public void start() {
		System.out.println(getCode()+"제품 "+super.getClass().getSimpleName()+"를 "+ chnnel+"으로 본다");
	}
	public void stop() {
		
	}
	public void display() {
		
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		
		builder.append("Tv [chnnel=");
		builder.append(chnnel);
		builder.append("]");
		return builder.toString();
	}

	public int getChnnel() {
		return chnnel;
	}

	public void setChnnel(int chnnel) {
		this.chnnel = chnnel;
	}

}
