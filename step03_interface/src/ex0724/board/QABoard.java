package ex0724.board;

public class QABoard extends Board {
	private boolean replyState;
	
	public QABoard() {}

	public QABoard(boolean replyState) {
		super();
		this.replyState = replyState;
	}
	public QABoard(int boardNum, String subject, String content) {
		super(boardNum,subject,content);
	}

	public QABoard(int boardNum, String subject, String writer, String content, boolean replyState) {
		super(boardNum, subject, writer, content);
		this.replyState = replyState;
	}
	
	



	

	
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", replyState=");
		builder.append(replyState);
		builder.append("]");
		
		return builder.toString();
	}
	
	

	public boolean isReplyState() {
		return replyState;
	}

	public void setReplyState(boolean replyState) {
		this.replyState = replyState;
	}

}
