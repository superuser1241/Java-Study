package ex0724.board;

public class MainApp {
	//필드를 이용한 다형성
	BoardService service;
	Board board;
	public MainApp() {
		System.out.println("---------------Free Test-----------------");
		service = new FreeBoardServiceImpl();
		board = new FreeBoard(4,"free 제목","삼순","어렵다");
		
		test(service, board);
		
		System.out.println("---------------QA Test-----------------");
		service = new QABoardServiceImpl();
		board = new QABoard(4,"free 제목","삼순","어렵다",true);
		
		test(service, board);
		
		System.out.println("---------------Upload Test-----------------");
		service = new UploadBoardServiceImpl();
		board = new UploadBoard(4,"free 제목","삼순","어렵다","test.jpg");
		
		test(service, board);
	}
	
	/**
	 * 각 Service의 insert, update, selectXxx을 호출해보자
	 */
	public void test(BoardService service, Board board) {
		service.insert(board);
		service.update(board);
		service.selectByBoard(1);
		service.delete();
		
		BoardService.selectAll();
		
		System.out.println("-------------------------------------------");
		
	}
	
	public static void main(String[] args) {
		System.out.println("-----------게시판 Test 해보기-------------");
		
		new MainApp();
	}

}
