package practice.maxwords;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* MaxWord
	여러문장으로 구성된 문자열을 입력받은뒤 
	문자열에서 가장 단어의 개수가 많은 문장을 찾아서, 
	그 문장과 문장의 단어의 개수를 출력
	'문장'의 구분은  .(마침표) !(느낌표) ?(물음표) 로 한다.
	'단어'구분은 '공백' 으로 한다
	
	입력예]	
	We test coders. Give us a try. Can you make it out? It's awesome.
	
	출력예]
	5개
	Can you make it out
 */
public class MaxWord {

	// TODO : 필요한 메소드 있으면 추가 작성

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 사용자가 문장 입력.
		StringTokenizer token1 = new StringTokenizer(str, ".!?"); // 입력한 문장을 .(마침표) !(느낌표) ?(물음표)로 쪼갠다.
//		String[] arr = new String [token1.nextToken().length()];  // 비어있는 String[]에 token들을 넣어서 하려고 했으나, 
//																  // 첫번째 token이 소실되거나, 5번째 토큰을 불러오려고 하면서 error가 발생함.
//																  // NoSuchElemantException
//		token1.countTokens(); // 토큰의 개수 세기...
		String[] arr = new String[4];
		for (int i = 0; token1.hasMoreTokens(); i++) {			
			arr[i] = token1.nextToken().trim();
//			System.out.println(arr[i]);
		}
		if (numOfWords(arr[0]) > numOfWords(arr[1])
			&& numOfWords(arr[0]) > numOfWords(arr[2]) 
			&& numOfWords(arr[0]) > numOfWords(arr[3])) {
			System.out.print(numOfWords(arr[0]) + "개\n");
			System.out.print(arr[0]);
		} else if (numOfWords(arr[1]) > numOfWords(arr[0])
			&& numOfWords(arr[1]) > numOfWords(arr[2]) 
			&& numOfWords(arr[1]) > numOfWords(arr[3])) {
			System.out.print(numOfWords(arr[1]) + "개\n");
			System.out.print(arr[1]);
		} else if (numOfWords(arr[2]) > numOfWords(arr[0])
				&& numOfWords(arr[2]) > numOfWords(arr[1]) 
				&& numOfWords(arr[2]) > numOfWords(arr[3])) {
			System.out.print(numOfWords(arr[2]) + "개\n");
			System.out.print(arr[2]);
		} else {
			System.out.print(numOfWords(arr[3]) + "개\n");
			System.out.print(arr[3]);
		}
//		System.out.println(arr[1].split("\\s+").length);
//		String[] arr;
//		arr[0] = token1.nextToken();
//		String arr1 = token1.nextToken(); // (We test coders)
//		String arr2 = token1.nextToken(); // (Give us a try)
//		String arr3 = token1.nextToken(); // (Can you make it out)
//		String arr4 = token1.nextToken(); // (It's awesome)
//		System.out.println(Arrays.toString(arr1.split("\\s+")).length());
//		System.out.println(Arrays.toString(arr1.split("\\s+")));
//		System.out.println(Arrays.toString(arr2.split("\\s+")).length());
//		System.out.println(Arrays.toString(arr2.split("\\s+")));
//		System.out.println(arr1.split("\\s+").length); // 단어의 갯수를 알기위해 length()를 하니 빨간줄이...		 
//		System.out.println(arr2.split("\\s+").length); // 자포자기 하며 ctrl + space bar를 누르니 length가 튀어나옴... 세상에 ㅠㅠ		
//		String[] arr2 = new String [token1.nextToken().length()];
//		String[] arr3 = new String [token1.nextToken().length()];
//		String[] arr4 = new String [token1.nextToken().length()];
//		for 
//		System.out.println(arr1);
//		System.out.println(arr2);
//		System.out.println(arr3);
//		System.out.println(arr4);
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		for (String s : token1.nextToken()) {
//			int cnt = s.
//		}
//		for (String s1 : token1.nextToken()) {
//			String s2 = s1.split("\\s+");
//		}

//		while (token1.hasMoreTokens()) {
//			String s = token1.nextToken();
//			System.out.print(s);
//			
//		}
//		String[] arr = token1.nextToken();
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr.length());
//		int cnt = arr.length();
//		System.out.println(cnt)?;

		sc.close();
	} // end main
	public static int numOfWords(String Sentence) {		
		int cnt = Sentence.trim().split("\\s+").length;
		return cnt;
	}
} // end class
