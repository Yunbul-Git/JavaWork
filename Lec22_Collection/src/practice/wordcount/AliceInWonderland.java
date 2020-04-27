package practice.wordcount;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

/* 1] 문서(문자열) 안의 단어의 빈도수를 계수해서 출력하기
 * 	- 대소문자 구분하지 않기 :   The 와 the 는 같은 단어
 *  - 2글자 이상만 계수하기
 *  - 구두점/기호 ",.\"\'`!?;:-()" 잘라내기
 *  - 공백 짤라내기
 * ex)
 * 	an : 234
 * 	the : 314
 * ...
 * 
 * hint]
 * 	split("\\s+")  --> String[]   
 * 	--> StringTokenizer  (혹은 정규표현식)
 *  	  --> HashMap<String, Integer>   <단어, 빈도수>  사용
 * ───────────────────────────────────────────────────────────    
 * 2] 빈도수 내림차순으로 정렬하여 출력하기
 * 	ex)
 *	1 the:113개
 *	2 she:92개
 *	3 to:85개
 *	...   
 *
 * hint]
 * 	Comparable<> 이나 Comparator<> 적용
 */

// TODO : 필요한 객체들 작성
// hint> 빈도수 담을 객체, Comparator<> ..

public class AliceInWonderland {

	public static void main(String[] args) {
		System.out.println("실습: 단어 발생 빈도");
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		String[] words = C.ALICE30.trim().toLowerCase().split("\\s+");

//		for (int i = 0 ; i < words.length;i++) {
//			System.out.println(words[i]);
//		}
//		for (int i = 0; i < words.length; i++) {
//			StringTokenizer token = new StringTokenizer(words[i], "[]'.-,:`?()!; ");
//		}
//		StringTokenizer tokenizer = new StringTokenizer(Arrays.toString(words), "[]'.-,:`?()!; ");
//		
//		for (int i = 0; i < tokenizer.countTokens(); i++) {
//			
//			if(hmap.keySet(i).equals())
//			hmap.put(tokenizer.nextToken(),i);
//			System.out.println(tokenizer.nextToken().trim());
//		}
		String[] token = new String[words.length]; // StringTokenizer로 구분한 token들을 담을 배열 생성
		for (int i = 0; i < words.length; i++) { // 각각의 token에 대해 특수문자를 제거하고 String[] 타입의 token에 삽입.
			token[i] = new StringTokenizer(words[i], "'.-,:`?()!;\"").nextToken();
			if (token[i].length() >= 2) {
				if (hmap.containsKey(token[i])) { // hmap에 같은 key(단어)가 있을때 value(빈도수)에 +1 을 수행,
													// 없을때는 1을 삽입.
					hmap.put(token[i], hmap.get(token[i]) + 1);
				} else {
					hmap.put(token[i], 1);
				}
			}

		}
		// 발생빈도 작성

//		for (int i = 0; i < token.length; i++) {
//			System.out.println(token[i]);
//		}
//		Collections.sort(hmap, new Desc());
//		for (String i : hmap.keySet()) {
//		for (int i : hmap.values()) {
//			System.out.println(i);
//		}

		// 결과 출력
		Set<Entry<String, Integer>> set = hmap.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>)itr.next();
			
			System.out.println(e.getKey() + " : " + e.getValue() + "개");
		}
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class

//class Alice implements Comparable<Alice> {
////	HashMap<String, Integer> base = new HashMap<String, Integer>();
//	String word;
//	Integer friq;
//
//	public Alice(String word, Integer friq) {
//		super();
//		this.word = word;
//		this.friq = friq;
//	}
//
//	public int compareTo(Alice o) {
//		if (o.friq > this.friq) {
//			return 1;
//		}
//		if (o.friq < this.friq) {
//			return -1;
//		}
//		return 0;
//	}
//} // end Alice

class Desc implements Comparator<HashMap<String, Integer>> {
//	HashMap<String, Integer> base;
	private final String key;
	public Desc(String key) {
		this.key = key;
	}

	@Override
	public int compare(HashMap<String, Integer> o1, HashMap<String, Integer> o2) {
		int result = o1.get(key).compareTo(o2.get(key));
		return result;
	}

}
