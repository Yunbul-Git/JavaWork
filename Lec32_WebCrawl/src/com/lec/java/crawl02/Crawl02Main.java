package com.lec.java.crawl02;

import java.io.File;
import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl02Main {

	public static void main(String[] args) throws IOException {
		System.out.println("네이트 실시간 인기 검색어");
		String url = "https://www.nate.com";
		Response rsp;
		Document doc;		
		
		rsp = Jsoup.connect(url).execute();
		System.out.println(rsp.statusCode()); // 200 확인
		
		File f = new File(url);
		Element ele;
		Elements eles;
		doc = rsp.parse();
		eles = doc.select("div.search_keyword dd a");
//		System.out.println(eles.attr("href"));
//		eles = doc.select("a");
		for (Element e : eles) {
			System.out.println(e.text().trim());
			System.out.println(e.attr("href"));
		}
		
		
		
		System.out.println("\n프로그램 종료");
	}

}
