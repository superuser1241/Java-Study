package ex0724.board;

public class UploadBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("Upload:"+board);
		System.out.println(super.getClass().getSimpleName()+"의 insert 입니다");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("Upload:"+board);
		System.out.println(super.getClass().getSimpleName()+"의 update 입니다");
		return false;
	}

	@Override
	public Board selectByBoard(int boardNum) {
		System.out.println(super.getClass().getSimpleName()+"의 상세보기 입니다");
		return new UploadBoard(30,"자료첨부","영준","다운로드 하세요","a.jpg");
	}

	@Override
	public void delete() {
		System.out.println("삭제기능 입니다");
		BoardService.super.delete();
	}
	

}
