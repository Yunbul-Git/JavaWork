package com.lec.java.crawl15;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

/* XML, Json 파싱 연습
 * 
 *■서울시 지하철 역사 정보
http://data.seoul.go.kr/dataList/datasetView.do?infId=OA-12753&srvType=A&serviceKind=1&currentPageNo=1

샘플url

XML 버젼
http://swopenAPI.seoul.go.kr/api/subway/4d46796d7366726f3833774a774955/xml/stationInfo/1/5/서울

JSON 버젼
http://swopenAPI.seoul.go.kr/api/subway/4d46796d7366726f3833774a774955/json/stationInfo/1/5/서울

*/


public class Crawl15Main {

	public static void main(String[] args) throws IOException{
		System.out.println("jackson-databind 연습2");

		
		ObjectMapper mapper = new ObjectMapper();
		URL url = new URL("http://swopenapi.seoul.go.kr/api/subway/4d46796d7366726f3833774a774955/json/stationInfo/1/5/%EC%84%9C%EC%9A%B8");
		
		StationList stationList = mapper.readValue(url, StationList.class);
		for(StationData e : stationList.getStationList()) {
//			System.out.println(e.getStatnNm());
//			System.out.println(e.getSubwayId());
//			System.out.println(e.getSubwayNm());
			System.out.printf("%s %s %s \n",e.getStatnNm(),e.getSubwayId(),e.getSubwayNm());
		}
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class

@JsonIgnoreProperties(ignoreUnknown = true) // stationList 만 가져오기 위해 
class StationList{
	private List<StationData> stationList;

	public List<StationData> getStationList() {return stationList;}
	public void setStationList(List<StationData> stationList) {this.stationList = stationList;}

}
@JsonIgnoreProperties(ignoreUnknown = true) // statnNM, subwayId, subwayNm 만 가져오기위해
class StationData{
	
	private String statnNm;
	private String subwayId;
	private String subwayNm;
	public String getStatnNm() {return statnNm;}
	public void setStatnNm(String statnNm) {this.statnNm = statnNm;}
	public String getSubwayId() {return subwayId;}
	public void setSubwayId(String subwayId) {this.subwayId = subwayId;}
	public String getSubwayNm() {return subwayNm;}
	public void setSubwayNm(String subwayNm) {this.subwayNm = subwayNm;}
	
}


