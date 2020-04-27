package com.lec.java.crawl01;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovie {

	public static void main(String[] args) throws IOException {
		String url = "https://movie.naver.com/movie/sdb/rank/rmovie.nhn";
		Document doc = Jsoup.connect(url).execute().parse();
		Element element;
		Elements elements = doc.select("#assistant > div:nth-child(1) ul.r_ranking li");
		for (Element e : elements) {
			e.selectFirst("span.blind").remove(); // ""안에있는 것을 삭제.
			System.out.println(e.select("a").text());
		}
	}

}
