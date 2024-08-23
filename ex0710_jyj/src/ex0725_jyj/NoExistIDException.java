package ex0725_jyj;

public class NoExistIDException extends Exception{
	public NoExistIDException() {}
	public NoExistIDException(String message) {
		super(message);
	}
}
