package ex0724.board;

public interface BoardService {
	/**
	 * 등록하기
	 * @return:0이면 실패, 1이상이면 성공
	 * @param: Board 객체
	 */
	int insert(Board board);
	
	/**
	 * 수정하기
	 * 	:글 번호에 해당하는 제목, 내용을 수정한다
	 * @return:true 이면 수정성공, false이면 수정 실패
	 * @param: Board객체
	 */
	boolean update(Board board);
	
	/**
	 * 글 번호에 해당하는 게시물 조회=검색
	 * @return:글 번호
	 * @param:없으면 null, 있으면 Board객체
	 */
	Board selectByBoard(int boardNum);
	
	/////////////////////////////////////////////////////
	/**
	 * java 1.8 version 추가
	 * 	: interface에 있는 메소드에 static이나 default 제한자를 추가하면
	 * 	body 선언할 수 있고 공통의 기능을 만들 수 있다.
	 * 	또한, 필요한 구현객체만 재정의하면 된다!!
	 * 	
	 * 	1)static
	 * 				:구현객체 없이 바로 interface이름.메소드이름() 호출 가능
	 * 	2)default
	 * 				:반드시 구현객체가 있어야 호출 가능
	 * 
	 * 삭제기능
	 */
	default void delete() {
	}
	/**
	 * 전체검색
	 */
	static void selectAll() {
		System.out.println("전체 검색 기능입니다");
	}
}
