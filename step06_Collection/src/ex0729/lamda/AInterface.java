package ex0729.lamda;

/**
 * 함수형 인터페이스
 * 	: 난 반드시 메소드가 한개만 있다
 * 		단, static, default, private 있을 수 있다
 * 		-> 람다식으로 코딩 할 수 있다.
 * 		: () -> 문법 사용가능
 * */

@FunctionalInterface //함수형 인터페이스
public interface AInterface {
	void aa();

	//default void cc() {}
}
