import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Data Access Object
//Java Database Connectivity
//(oracle , mssql , mysql , mariaDb ..............)
public class Ex01_DAO { // 실제 DB와 연동하여 요구사항 처리 후 리턴(main실행부로)
	private Connection conn; // 연결객체
	private PreparedStatement ps;// 전송 객체
	private ResultSet rs; // 결과객체
	// 선언만 해둔상태이기 때문에 모든 객체들은 null상태이다.
	// DB에 접속할수있는 접속 정보를 정의하고 Connection객체부터 차례대로 초기화를 시켜야함.

	// Connection을 리턴하는 메소드를 만들어야한다.
	// 리턴타입이 있는 (void가 아닌 메소드)

	// DB접속 메소드
	public Connection getConn() {
		// url(아이피정보 , 포트정보 , 오라클 버전 정보)
		// user(계정의 이름) ex ) hanul
		// password = ex) 0000
		// ojdbc8 <- 동적 클래스 로딩하는 로직이 필요함.
		// oracle.jdbc.driver.OracleDriver <- 동적로딩할 드라이버형태의 클래스
		// String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hanul";
		String password = "0000";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			//임시로 테스트할 코딩을 추가 연결테스트 완료후 삭제예정
			//if(conn.isClosed()) {
			//				System.out.println("연결이 닫힘");
			//			}else {
			//				System.out.println("연결이 안닫힘");
			//			}
			//			conn.close();
			//			if(conn.isClosed()) {
			//				System.out.println("연결이 닫힘");
			//			}else {
			//				System.out.println("연결이 안닫힘");
			//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// oracle dev => 새접속 클릭 =>접속정보hanul@//localhost:1521/xe
		return conn;
	}
	// 리턴타입이 없는 (void인 형태의 메소드)
	//작업순서(정순): 접속 (conn) , 전송(ps) , 결과(rs)
	//종료순서(역순) : 결과 객체 비우기(닫기) , 전송객체 닫기 , 접속객체 닫기
	public void dbClose() {
		try {
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
