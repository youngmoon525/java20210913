package pack04_database;
public class DbMain {
	public static void main(String[] args) {
		//Interface를 같이 상속 받았을때 Interface = new 클래스();
		//RemoteControll rc;
		//rc = new Audio(); <=캐스팅이되서 사용이 가능해짐
		//rc = new TvClass();
//		DataAccessObject dao;//Interface
//		dao = new MsSqlDAO();//같은 DataAccessObject I 상속받은.
//		dao.select();
//		dao = new OracleDAO();//같은 DataAccessObject I 상속받은.
//		dao.select();
		MsSqlDAO dao = new MsSqlDAO();
		//dbWork( dao );
		dbWork(new MsSqlDAO());
		OracleDAO dao2 = new OracleDAO();
		//dbWork(dao2);
		dbWork(new OracleDAO());
	}
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		dao.createTable();//<-사용이 불가능
		//설계도에서 제공하는 메소드가 아니기때문에
	}
}
