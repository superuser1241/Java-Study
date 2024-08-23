package ex0724.board;
/**
 * 글 번호, 제목, 작성자, 내용
 */
public class Board {
	private int boardNum;
	private String subject;
	private String writer;
	private String content;
	
	public Board() {	}
	public Board(int boardNum, String subject, String content) {
		this.boardNum = boardNum;
		this.subject = subject;
		this.content = content;
	}
	
	public Board(int boardNum, String subject, String writer, String content) {
		this(boardNum,subject, content);
		this.writer = writer;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [boardNum=");
		builder.append(boardNum);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", content=");
		builder.append(content);
		
		return builder.toString();
	}
	
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
