package com.ws03.exception;
/**
 * 잔액 부족할 때 발생시킬 예외 객체
 */
public class BalanceLackException extends Exception {
	public BalanceLackException() {
		super("잔액 확인해주세요");
	}
	public BalanceLackException(String message) {
		super(message);
	}
}
