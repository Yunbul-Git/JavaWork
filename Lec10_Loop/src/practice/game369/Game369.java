package practice.game369;

public class Game369 {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		for (int n = 1; n <= i; n++) {
			if (n != 3 && n != 6 && n != 9)
				System.out.print(n + "  ");
			else
				System.out.print("*  ");
		} // end 1 ~ 10까지 for (열을 맞추기 위해 1 ~ 10까지는 따로 작성)
		System.out.println();
		for (int n = 1; n <= i - 1; n++) {
			for (int m = 1; m <= j; m++) {
				if (m != 10) { //1 ~ 9까지의 열 작성 (11 ~ 19 , 21 ~ 29 ..)
					if (n == 3 || n == 6 || n == 9 || 
						m == 3 || m == 6 || m == 9) {
						System.out.print("*  ");
					} else {
						System.out.print(n * 10 + m + " ");
					}
				} else { // 10번째 열 작성 (10, 20, 30, ...) 
					if (n == 2 || n == 5 || n == 8) {
						System.out.print("*  ");
					} else
						System.out.print(n * 10 + m + " ");
				}
			}
			System.out.println();
		}

	}

}