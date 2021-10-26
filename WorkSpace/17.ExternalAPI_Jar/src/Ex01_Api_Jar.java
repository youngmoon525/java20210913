import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
//DAO <- 
public class Ex01_Api_Jar {
	public static void main(String[] args) {
		Ex01_DAO dao = new Ex01_DAO();
		ArrayList<Ex01_DTO> list =  dao.memberSelect();
		for (Ex01_DTO dto : list) {
			System.out.println(dto.getName());
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		
		Ex01_HRDAO daoh = new Ex01_HRDAO();
		ArrayList<HrDTO> list2 = daoh.memberSelect();
		for (HrDTO dto : list2) {
			System.out.println(dto.getFirst_name());
		}
		//dao.getConn();
		///dao.dbClose();
		
		
		
	}
}
