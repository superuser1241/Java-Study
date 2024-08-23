package com.ws03.dto;

public class LoanAccountDto extends AccountDto {
	private String mortgage;
	

	public LoanAccountDto() {
		super();
	}

	public LoanAccountDto(int accountSeq, String accountNumber, int balance, int userSeq,String morgage) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.mortgage = morgage;
	}

	public String getMortgage() {
		return mortgage;
	}

	public void setMortgage(String mortgage) {
		this.mortgage = mortgage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("LoanAccountDto [mortgage=");
		builder.append(mortgage);
		builder.append("]");
		return builder.toString();
	}
	
}
