package com.ws03.dto;

/**
 *  고객의 계좌정보 관리하는 객체
 * */
public class AccountDto implements Comparable<AccountDto> {
   private int accountSeq;
   private String accountNumber;
   private int balance;
   
   
   
   public int getAccountSeq() {
	return accountSeq;
}
public void setAccountSeq(int accountSeq) {
	this.accountSeq = accountSeq;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public int getUserSeq() {
	return userSeq;
}
public void setUserSeq(int userSeq) {
	this.userSeq = userSeq;
}
private int userSeq;
   
   public AccountDto() {}
   public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
	this.accountSeq = accountSeq;
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.userSeq = userSeq;
  }
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("AccountDto [accountSeq=");
	builder.append(accountSeq);
	builder.append(", accountNumber=");
	builder.append(accountNumber);
	builder.append(", balance=");
	builder.append(balance);
	builder.append(", userSeq=");
	builder.append(userSeq);
	builder.append("]");
	return builder.toString();
}
@Override
public int compareTo(AccountDto o) {
	return (balance - o.balance) == 0 ?(o.getUserSeq() - userSeq ) : balance - o.balance;
}
   
  
}
