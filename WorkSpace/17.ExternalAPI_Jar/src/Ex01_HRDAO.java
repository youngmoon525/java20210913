import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ex01_HRDAO { // 실제 DB와 연동하여 요구사항 처리 후 리턴(main실행부로)
	private Connection conn; // 연결객체
	private PreparedStatement ps;// 전송 객체
	private ResultSet rs; 
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hr";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void dbClose() {
		try {
			if(rs != null) {rs.close();}
			if(ps != null) {ps.close();}
			if(conn != null) {conn.close();}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Ex01_DTO = > Ex01_HRDTO 변경
	//select 해오는 테이블이 바뀌었기 때문에 ....
	public ArrayList<Ex01HrDTO> memberSelect(int a , int b) {
		ArrayList<Ex01HrDTO> list = new ArrayList<>();
		conn = getConn();//접속 객체를 메소드를 이용해서 초기화.
		String sql = " select * from EMPLOYEES " + 
				"WHERE employee_id BETWEEN ? and ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, a);
			ps.setInt(2, b);
			rs = ps.executeQuery();
			//전송객체가 쿼리를 실행하고 그결과를 rs에 담음
			while(rs.next()) {
				Ex01HrDTO dto = new Ex01HrDTO(rs.getInt("employee_id")
								, rs.getString("first_name")
								, rs.getString("last_name")
								, rs.getString("email")
								, rs.getString("phone_number")
								);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return list;
	}
}
