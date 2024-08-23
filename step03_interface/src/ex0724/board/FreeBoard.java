package ex0724.board;

public class FreeBoard extends Board {
	

	public FreeBoard() {
		super();
	}
	//수정할 때 사용할 생성자
	public FreeBoard(int boardNum, String subject, String content) {
		super(boardNum,subject,content);
	}

	public FreeBoard(int boardNum, String subject, String writer, String content) {
		super(boardNum, subject, writer, content);
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("]");
		
		return builder.toString();
	}

	


}
