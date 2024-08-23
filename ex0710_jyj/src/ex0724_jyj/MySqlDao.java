package ex0724_jyj;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println(super.getClass().getSimpleName()+" DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println(super.getClass().getSimpleName()+" DB에 삽입");

	}

	@Override
	public void update() {
		System.out.println(super.getClass().getSimpleName()+" DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println(super.getClass().getSimpleName()+" DB에서 삭제");

	}

}
