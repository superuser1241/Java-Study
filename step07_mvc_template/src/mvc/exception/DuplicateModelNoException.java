package mvc.exception;
/**
 * 모델번호가 중복인경우
 */
public class DuplicateModelNoException extends Exception {
	public DuplicateModelNoException() {
		
	}
	public DuplicateModelNoException(String message) {
		super(message);
	}
}
