package ex0725;

class Board{}

public class Exam01Main {
	public static void main(String[] args) {
		Box <String> box01 = new Box<String>();
		box01.content="새우깡";
		
		Box<Integer> box02 = new Box<Integer>();
		box02.content=100;
		box02.setContent(10); //int --> Integer
		
		int no = box02.getContent();   //Integer --> int
		
		Box<Board> box03 = new Box<Board>();
		box03.content= new Board();
		
		//제네릭을 선언하지 않으면 Object가 된다
		Box box4 = new Box();
		//box4.set
	}

}
