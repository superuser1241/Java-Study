package com.ws03.service;
/**
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;

public class BankService {
	
	List<UserDto> userList = new ArrayList<>();
	List<AccountDto> accountList = new ArrayList<>();
	
	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 * */
	public BankService() {
		//배열 생성
		 userList = new ArrayList<UserDto>();
		 accountList = new ArrayList<AccountDto>();
		
		// 각 배열방에 고객과 계좌를 생성한다.
		 //고객 4명
		 userList.add(new UserDto(100, "장희정", "8253jang@daum.net", "010-8875-8253", false));
		 userList.add(new UserDto(200, "이효리", "lee@daum.net", "010-2222-3333", false));
		 userList.add(new UserDto(300, "송중기", "song@naver.com", "010-5554-2222", false));
		 userList.add(new UserDto(400, "삼순이", "sam@daum.com", "010-2222-2222", false));
		 
		 
		 //계좌는 6개 정도
		 accountList.add(new AccountDto(1, "1111-11111", 1000000, 100));
		 accountList.add(new AccountDto(2, "2222-22222", 250000, 100));
		 accountList.add(new AccountDto(3, "3333-33333", 350000, 100));
		 accountList.add(new AccountDto(4, "4444-44444", 150000, 200));
		 accountList.add(new AccountDto(5, "5555-55555", 250000, 200));
		 accountList.add(new AccountDto(6, "6666-66666", 350000, 300));
		 
		 System.out.println("---세팅완료!!----");
		 
		 
		 
	}//생성자 끝
	
    /**
	  특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/
	public List<AccountDto> getAccountList(int userSeq) {
		//리턴할 List 준비 --> 찾은 계좌 정보를 저장해서 리턴
		List<AccountDto> searchAccountDtoList = new ArrayList<AccountDto>();
		
		for(AccountDto dto : accountList) {
			if(dto.getUserSeq() == userSeq) {
				 //찾았다!!
				searchAccountDtoList.add(dto);
			}
		}
		return searchAccountDtoList;
	}
	
	public List<AccountDto> getAccountList() {
		return accountList;
	}
	
	/**
	   특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	   
	   @param : 고객의 sequence
	   @return : null이면 고객의정보없다 
	**/
	public UserDto getUserDetail(int userSeq) {
		for(UserDto dto : userList) {
			if(dto.getUserSeq() == userSeq) {
				return dto;
			}
		}
		return null;
	}

	

	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> sortedAccList = new ArrayList<AccountDto>(accountList);
		Collections.sort(sortedAccList);
		return sortedAccList;
	}
	
	
	public List<AccountDto> getAccountListSortByUserSeq() {
		List<AccountDto> sortedList = new ArrayList<AccountDto>(accountList);
		//1. 기존 식
		//Collections.sort(sortedList, new AccountSortImpl());
		
		//2.인수에 직접 구현하는 방법
		/*Collections.sort(sortedList, new Comparator<AccountDto>() {

			@Override
			public int compare(AccountDto o1, AccountDto o2) {
				return o1.getUserSeq() - o2.getUserSeq();
			}
			
		});*/
		
		//3. 람다식
		Collections.sort(sortedList, (o1,o2)-> o1.getUserSeq() - o2.getUserSeq());
		
		return sortedList;
	}
	
	
}

/**
 * 정렬
 * :ComParator메소드에 전달된 두개의 객체를 비교해서 int형을 리턴(음수, 0 , 양수)
 */
/*class AccountSortImpl implements Comparator<AccountDto>{

	@Override
	public int compare(AccountDto o1, AccountDto o2) {
		return o1.getUserSeq() - o2.getUserSeq();
	}
	
}*/



