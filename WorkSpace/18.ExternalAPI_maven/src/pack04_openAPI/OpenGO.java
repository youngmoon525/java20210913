package pack04_openAPI;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class OpenGO {
	public static void main(String[] args) {
		//1.Url  인터넷의 주소 .
		//2.Url을 호출할때 넘겨줘야할 값들이필요.
		//https://api.odcloud.kr/api/3082925/v1/uddi:7c291067-a956-4811-a9ec-942b6979ff77_201709270816
		//?page=1
		//&perPage=10
		//&serviceKey=C%2Bs6aUnodQBsE9joWNITkbdNay8YjJkk%2BbBPEHHuPr63PvQcSd3PIPeYiH3aKgyOYMJQzI0RSm%2BLpIISoE03Sg%3D%3D
		//3.Json형태로 받아서 사용하기.
		//json은 key와 value 가 중괄호 블럭으로 { , } 안에서 표현이 되고 , 대괄호 [ , ]
		//는 하나의 리스트라고 생각하면된다.
		//{} <- Object(String,int) []<- Array
		String url = "https://api.odcloud.kr/api/3082925/v1/uddi:7c291067-a956-4811-a9ec-942b6979ff77_201709270816";
		//javacode에서 html주소로 request 응답을 요청받기위한 처리↓
		try {
			String doc = Jsoup.connect(url).data("page", "1").data("perPage", "10")
						 .data("serviceKey","C+s6aUnodQBsE9joWNITkbdNay8YjJkk+bBPEHHuPr63PvQcSd3PIPeYiH3aKgyOYMJQzI0RSm+LpIISoE03Sg==")
						 .timeout(4000).userAgent("Chrome").ignoreContentType(true)
						 .execute().body();
			System.out.println(doc);
			JSONParser jsonParser = new JSONParser();
			try {
				JSONObject jsonObj =(JSONObject) jsonParser.parse(doc);
				JSONArray jarr = (JSONArray) jsonObj.get("data");
				//String[] arr = new String[3]
				String a = "1";
				int b = Integer.parseInt(a) ; //Wrapper Class를 이용해서 parse.Int();
				ArrayList<GoDTO> list = new ArrayList<>();
				for(int i = 0; i< jarr.size(); i++) {
					JSONObject obj = (JSONObject) jarr.get(i);
					GoDTO dto = new GoDTO(
							obj.get("상 호")+"", //생성자 메소드 파라메터 String 
							obj.get("소재지")+"", //String
							obj.get("연락처")+"", //String
							Integer.parseInt(obj.get("연번")+""), //int
							obj.get("주메뉴")+"");//String
					list.add(dto);
//					list.add(new GoDTO(
//							obj.get("상 호")+"", 
//							obj.get("소재지")+"",
//							obj.get("연락처")+"", 
//							Integer.parseInt(obj.get("연번")+""), 
//							obj.get("주메뉴")+""));
				}//for
				//foreach문을 이용해서 dto의 내용을 출력하기
				for (GoDTO goDTO : list) {//  : <-기준 좌측은 빼올 그릇  : <-기준 우측 : 빼올 기준.
					System.out.println(goDTO.getTitle() + goDTO.getLocation());
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
