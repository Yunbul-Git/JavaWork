package com.lec.java.crawl03;

import java.io.File;
import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl03Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Daum 실시간 인기 검색어");
		Response rsp;
		Document doc;
		Element ele;
		Elements eles;
		String url = "https://www.daum.net";
		rsp = Jsoup.connect(url).execute();
		File f = new File(url);
		System.out.println(rsp.statusCode()); // 200
		doc = rsp.parse();
		eles = doc.select("div.slide_favorsch a");
		System.out.println(eles.size());
		
		for (Element e : eles) {
			System.out.println(e.text().trim());
			System.out.println(e.attr("href"));
			
		}
		
		
		
		
		System.out.println("\n프로그램 종료");
		
	}

}
