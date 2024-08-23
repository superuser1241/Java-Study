package com.ws03.service;

import java.util.List;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;
import com.ws03.exception.BalanceLackException;
import com.ws03.exception.UserAccountNotFoundException;

public interface BankService {
	List<AccountDto> getAccountList(int userSeq);
	UserDto getUserDetail(int userSeq);
	List<AccountDto> getAccountList();
	List<AccountDto> getAccountListSortByBalance();
	List<AccountDto> getAccountListSortByUserSeq();
	
	//WS_07에 추가된 메소드
	AccountDto getUserAccount(int userSeq, int accountSeq)
			 throws UserAccountNotFoundException;
	
	int withdraw(int userSeq, int accountSeq, int amount)
			 throws BalanceLackException, UserAccountNotFoundException;
	
}
