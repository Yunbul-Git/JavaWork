package com.lec.java.crawl09;
// 연습

import java.io.IOException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// 네이버 '검색어'
// 블로그
// posttitle
// posturl
// blogtitle

// 페이징 구현
public class Crawl09Main {

	public static void main(String[] args) throws IOException {
		System.out.println("네이버 블로그 포스트");
		for (int i = 1; i <= 1001; i += 10) {
			System.out.println(i);
			crawlNaverBlog("파이썬", i);
		}
		System.out.println("\n프로그램 종료");
	}// end main

	public static void crawlNaverBlog(String search, int blogNum) throws IOException {

		String url;
		Document doc;
		Elements elements;
		Elements rowElements;

		url = "https://search.naver.com/search.naver?date_from=&date_option=0&date_to=&dup_remove=1&nso=&post_blogurl=&post_blogurl_without=&query="
				+ URLEncoder.encode(search, "utf-8") + "&sm=tab_pge&srchby=all&st=sim&where=post&start=" + blogNum;

		doc = Jsoup.connect(url).execute().parse();

		elements = doc.select("#elThumbnailResultArea > li.sh_blog_top > dl");
//		System.out.println(elements.size()); //10개 확인
		for (Element e : elements) {
			String postTitle = e.select("a").text().trim();
			String postUrl = e.select("dd a.url").attr("href").trim();
			String blogTitle = e.selectFirst("dd a.txt84").text().trim();
			;
//			System.out.println(postTitle);
//			System.out.println(postUrl);
//			System.out.println(blogTitle);
			System.out.println(postTitle + ":" + postUrl + ":" + blogTitle);

		}

	}

}// end class
