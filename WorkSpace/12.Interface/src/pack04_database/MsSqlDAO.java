package pack04_database;

public class MsSqlDAO implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MsSql을 이용해서 데이터 조회");
	}

	@Override
	public void insert() {
		System.out.println("MsSql을 이용해서 데이터 추가");
	}

	@Override
	public void update() {
		System.out.println("MsSql을 이용해서 데이터 수정");
	}

	@Override
	public void delete() {
		System.out.println("MsSql을 이용해서 데이터 삭제");
	}
	public void createTable() {
		System.out.println("테이블을 생성함");
	}
}
