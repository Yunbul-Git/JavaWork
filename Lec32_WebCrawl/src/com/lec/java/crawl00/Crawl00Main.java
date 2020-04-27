package com.lec.java.crawl00;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl00Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Jsoup");

		File f = new File("data/hello.html");
		Document doc = Jsoup.parse(f, "UTF-8"); // 파일 -> document 변환
		Element element;
		Elements elements;
		// System.out.println(doc.outerHtml());
		element = doc.selectFirst("div");
		//System.out.println(element.outerHtml());
		elements = doc.select("div");
		System.out.println(elements.size());
		
//		element = elements.get(2); // 2번째 element 리턴
//		System.out.println(element.outerHtml());

//		for (int i = 0; i < elements.size(); i++) {
//			element = elements.get(i);			
//			System.out.println(element.outerHtml());
//		}
//		
//		for (Element element2 : elements) {
//			System.out.println(elements.outerHtml());
//			System.out.println();
//		}
		
//		element = doc.selectFirst("div#addr");
//		System.out.println(element.outerHtml());
//		
//		elements = element.select("ul.favorite a");
//		System.out.println(elements.size());
//
//		for (Element e : elements) {
//			System.out.println(e.outerHtml());
//			System.out.println(e.text().trim());
//			System.out.println(e.attr("href").trim());
//		}
		
		elements = doc.select("img");
//		System.out.println(elements.size());
		for (Element e : elements) {
			System.out.println(e.attr("src"));
		}
		
		
		System.out.println("\n프로그램 종료");
	}

}
