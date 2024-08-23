package part06_jyj;

public class Account {
	private int balance;
	static final int MIN_BALANCE =0;
	static final int MAX_BALANCE =1_000_000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<MIN_BALANCE | balance>MAX_BALANCE) {
			this.getBalance();
		}
		else	this.balance = balance;
	}
	
	public static void main(String[] args) {
		Account account =new Account();
		
		
		
		
		account.setBalance(500);
		System.out.println(account.getBalance());
		
		account.setBalance(-500);
		System.out.println(account.getBalance());
		
		account.setBalance(1000);
		System.out.println(account.getBalance());
		
		account.setBalance(50000000);
		System.out.println(account.getBalance());
	}
	
}
