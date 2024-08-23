package part06_jyj.accountExam;

public class Account {
	private int accountNum;
	private String name;
	private int initMoney;
	
	public Account() {}
	public Account(int accountNum, String name, int initMoney) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.initMoney = initMoney;
	}
	
	
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInitMoney() {
		return initMoney;
	}
	public void setInitMoney(int initMoney) {
		this.initMoney = initMoney;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [accountNum=");
		builder.append(accountNum);
		builder.append(", name=");
		builder.append(name);
		builder.append(", initMoney=");
		builder.append(initMoney);
		builder.append("]");
		return builder.toString();
	}
	
	
}
