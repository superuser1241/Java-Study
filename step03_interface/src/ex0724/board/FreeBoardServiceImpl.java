package ex0724.board;

public class FreeBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("Free:" +board);
		System.out.println(super.getClass().getSimpleName()+"의 insert 입니다");
		return 2;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("Free:" +board);
		System.out.println(super.getClass().getSimpleName()+"의 update 입니다");
		return true;
	}

	@Override
	public Board selectByBoard(int boardNum) {
		System.out.println(super.getClass().getSimpleName()+"의 selectByBoard 입니다");
		return new FreeBoard(20,"수업중","영준","좋아요");
	}

}
