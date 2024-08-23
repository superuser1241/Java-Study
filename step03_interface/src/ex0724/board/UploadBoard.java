package ex0724.board;

public class UploadBoard extends Board {
	private String fileName;

	public UploadBoard() {
	}

	public UploadBoard(String fileName) {
		super();
		this.fileName = fileName;
	}

	public UploadBoard(int boardNum, String subject, String content) {
		super(boardNum, subject, content);
	}

	public UploadBoard(int boardNum, String subject, String writer, String content, String fileName) {
		super(boardNum, subject, writer, content);
		this.fileName = fileName;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", fileName=");
		builder.append(fileName);
		builder.append("]");
		return builder.toString();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
