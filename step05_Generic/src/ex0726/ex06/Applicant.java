package ex0726.ex06;

public class Applicant<T> {
  private T kind; //사람, 직장인, 학생, 고등, 중학
  
  public Applicant(T kind) {
	  this.kind = kind;
  }
  
  public T getKind() {
	return kind;
}

	public void setKind(T kind) {
		this.kind = kind;
	}
	
	
  
  
}
