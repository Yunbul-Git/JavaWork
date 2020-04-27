package com.lec.java.crawl08;

import java.io.IOException;
import java.net.URLEncoder;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* 크롤링 검색 페이징
 *  - '첫 페이지' url
 *  - '두번째 페이지'부터의 url 변화 확인 : 어떤방식? 어떤 parameter?
 *  - 검색결과 페이징의 '마지막 페이지'는 어떻게 처리하는지 확인
 */

public class Crawl08Main {

	public static void main(String[] args) throws IOException {
		System.out.println("페이징 : pagination");
		for(int i = 1 ; i <=10 ; i++) {
		crawlDaumBlog("파이썬",i);
		}
		System.out.println("\n프로그램 종료");
	}
	public static void crawlDaumBlog(String search, int page) throws IOException {
		//post title
		//post linkurl
		//blog title
		
		// 매개변수 검증
		if(search == null || search.trim().length() == 0 || page < 1) return;
		
		String url;
		Document doc;
		Elements elements;
		Elements rowElements;
		Response response;
		
		url = String.format("https://search.daum.net/search?w=blog&DA=PGD&enc=utf8&q=%s&page=%d",
				URLEncoder.encode(search,"utf-8"),page);
		
		doc = Jsoup.connect(url).execute().parse();
		elements = doc.select("#blogColl ul > li > div.wrap_cont");
		System.out.println(page + " 페이지]");
		//System.out.println(elements.size()); // 10개 확인
		for (Element e : elements) {
			String postTitle = e.selectFirst("a").text().trim();
			String blogTitle = e.selectFirst(".info .f_nb").text().trim();
			String blogUrl = e.selectFirst("a").attr("href").trim();
			
//			System.out.println(postTitle);
//			System.out.println(blogTitle);
//			System.out.println(blogUrl);
			System.out.println(postTitle + ":" + blogTitle + ":" + blogUrl);
		}//end for
		
		System.out.println();
		
		
	} // end crawlDaumBlog()

} // end class
