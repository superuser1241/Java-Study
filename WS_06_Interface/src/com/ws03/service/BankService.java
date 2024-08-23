package com.ws03.service;

import java.util.List;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;

public interface BankService {
	List<AccountDto> getAccountList(int userSeq);
	UserDto getUserDetail(int userSeq);
	List<AccountDto> getAccountList();
	List<AccountDto> getAccountListSortByBalance();
	List<AccountDto> getAccountListSortByUserSeq();
	
}
