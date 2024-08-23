package ex0725.ex02;

/**
 * 상품의 정보 : 종류, 모델정보
 */
public class Product<K, M> {
	private K kind;
	private M model;
	
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
