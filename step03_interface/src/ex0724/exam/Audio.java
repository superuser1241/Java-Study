package ex0724.exam;

public class Audio extends Elec implements ElecFunction {
	private int volumn;
	
	public Audio() {}

	public Audio(int volumn) {
		super();
		this.volumn = volumn;
	}
	public Audio(String code, int cost, int volumn) {
		super(code,cost);
		this.volumn =volumn;
	}
	
	public void start() {
		System.out.println(getCode()+"제품 "+super.getClass().getSimpleName()+"를"+ volumn+"으로 듣는다");
	}
	public void stop() {
		
	}
	public void display() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		
		builder.append("Audio [volumn=");
		builder.append(volumn);
		builder.append("]");
		return builder.toString();
	}

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
}
