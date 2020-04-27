package daily.dailysum;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * 연습 : 자치구단위 서울 생활인구 일별 집계표
 * ■자치구단위 서울 생활인구 일별 집계표
 * 	http://data.seoul.go.kr/dataList/datasetView.do?infId=OA-15379&srvType=S&serviceKind=1&currentPageNo=1
 * 	http://openapi.seoul.go.kr:8088/(인증키)/(요청파일타입)/SPOP_DAILYSUM_JACHI/(요청시작INDEX)/(요청종료INDEX)/(기준일ID)/(시군구코드)
 * 
 * 샘플url
 * 	XML 버젼
 * 	http://openapi.seoul.go.kr:8088/(인증키)/xml/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/20190101
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/xml/SPOP_DAILYSUM_JACHI/1/5/20190101/11000
 * 
 * 	JSON 버젼
 * 	http://openapi.seoul.go.kr:8088/(인증키)/json/SPOP_DAILYSUM_JACHI/1/5/
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/	
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/20190101
 * 		예] http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/json/SPOP_DAILYSUM_JACHI/1/5/20190101/11000
 * 
 * ※ 한번에 1000개 까지의 데이터만 볼수 있슴
 * 
 */

/*  입력예]
 *  날짜입력: 20190101
 *  시작Index : 1
 *  끝Index: 5
 *  
 *  [XML]
 *  날짜             구ID        총생활인구수           일최대이동인구수
 *  ----------------------------------------------------------------------
 *  20190101	11000    11121182.98210      4764635.18080 
 *  20190101    11110    274919.65940        177877.95000 
 *  20190101    11140    267096.65940        149729.45840 
 *  20190101    11170    315220.18480        149329.14120 
 *  20190101    11200    351993.77950        153738.94490
 *   
 *  [JSON]
 *  날짜             구ID        총생활인구수           일최대이동인구수
 *  ----------------------------------------------------------------------
 *  20190101	11000    11121182.98210      4764635.18080 
 *  20190101    11110    274919.65940        177877.95000 
 *  20190101    11140    267096.65940        149729.45840 
 *  20190101    11170    315220.18480        149329.14120 
 *  20190101    11200    351993.77950        153738.94490 
 * 
 */

// ★ 주목 ★
// XML 은 Jsoup 를 활용하여 파싱하세요
// JSON 은  jackson 을 활용하여 파싱하세요

public class DailySumMain {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜입력(YYYYMMdd):");
		int date = sc.nextInt();
		System.out.print("시작Index : ");
		int startIndex = sc.nextInt();
		System.out.print("끝Index : ");
		int endIndex = sc.nextInt();
		
		
		String url1 = "http://openapi.seoul.go.kr:8088/4d46796d7366726f3833774a774955/";
		String url2 = "/SPOP_DAILYSUM_JACHI/" + startIndex + "/" + endIndex + "/" + date;
		xmlParse(url1, url2);
		System.out.println();
		jsonParse(url1, url2);
		System.out.println("\n프로그램 종료");
	}
	public static void xmlParse(String url1, String url2) throws IOException {

		Document doc;
		Elements elements;
		doc = Jsoup.connect(url1 + "xml" + url2).execute().parse();

//		Response response;
//		response = Jsoup.connect(url).execute();
//		System.out.println(response.statusCode()); // 200 확인
		System.out.println();
		elements = doc.select("row");

//		System.out.println(elements.size()); // 5개 확인
		System.out.println("[XML]");
		System.out.println("날짜\t\t구ID\t총생활인구수\t일최대이동인구수");
		System.out.println("-----------------------------------------------------");
		for (Element e : elements) {
			String STDR_DE_ID = e.select("STDR_DE_ID").text().trim();
			String SIGNGU_CODE_SE = e.select("SIGNGU_CODE_SE").text().trim();
			String TOT_LVPOP_CO = e.select("TOT_LVPOP_CO").text().trim();
			String DAIL_MXMM_MVMN_LVPOP_CO = e.select("DAIL_MXMM_MVMN_LVPOP_CO").text().trim();
			System.out
					.println(STDR_DE_ID + "\t" + SIGNGU_CODE_SE + "\t" + TOT_LVPOP_CO + "\t" + DAIL_MXMM_MVMN_LVPOP_CO);
		}
	}
	public static void jsonParse(String url1, String url2) throws IOException{
		
		URL urlAddress = new URL(url1 + "json" + url2);
		
		ObjectMapper mapper = new ObjectMapper();
		
		Subway subway = mapper.readValue(urlAddress, Subway.class);
		System.out.println("[JSON]");
		System.out.println("날짜\t\t구ID\t총생활인구수\t일최대이동인구수");
		System.out.println("-----------------------------------------------------");
		for (SubRow e : subway.getSPOP_DAILYSUM_JACHI().getRow()) {
			System.out.println(e.getDate() + "\t" + e.getGuCode() + "\t" + e.getTotalPop() + "\t" +e.getDailyMovePop());
		}
	}
} // end class

class Subway {
	public Stats SPOP_DAILYSUM_JACHI;

	public Stats getSPOP_DAILYSUM_JACHI() {return SPOP_DAILYSUM_JACHI;}

	public void setSPOP_DAILYSUM_JACHI(Stats sPOP_DAILYSUM_JACHI) {SPOP_DAILYSUM_JACHI = sPOP_DAILYSUM_JACHI;}
	
}
@JsonIgnoreProperties(ignoreUnknown = true)
class Stats {
	
	private List<SubRow> row;
	
	// getter & setter
	public List<SubRow> getRow() {return row;}
	public void setRow(List<SubRow> row) {this.row = row;}
	
}
@JsonIgnoreProperties(ignoreUnknown = true)
class SubRow{
	
	@JsonProperty("STDR_DE_ID")
	private String date;
	@JsonProperty("SIGNGU_CODE_SE")
	private String guCode;
	@JsonProperty("TOT_LVPOP_CO")
	private String totalPop;
	@JsonProperty("DAIL_MXMM_MVMN_LVPOP_CO")
	private String dailyMovePop;
	
	// getter & setter
	
	public String getDate() {return date;}
	public void setDate(String date) {this.date = date;}
	public String getGuCode() {return guCode;}
	public void setGuCode(String guCode) {this.guCode = guCode;}
	public String getTotalPop() {return totalPop;}
	public void setTotalPop(String totalPop) {this.totalPop = totalPop;}
	public String getDailyMovePop() {return dailyMovePop;}
	public void setDailyMovePop(String dailyMovePop) {this.dailyMovePop = dailyMovePop;}
	
}