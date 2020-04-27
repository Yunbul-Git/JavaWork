package practice.gugu2;

public class Gugu2 {

	public static void main(String[] args) {

		for (int a = 2; a <= 9; a += 3) {
			if (a < 6) {
				for (int b = 1; b <= 9; b++) {
					System.out.println(a + " * " + b + " = " + a * b + 
							  "  " + (a + 1) + " * " + b + " = " + (a + 1) * b
							+ "  " + (a + 2) + " * " + b + " = " + (a + 2) * b);
				}
			} else {
				for (int b = 1; b <= 9; b++) {
					System.out
							.println(a + " * " + b + " = " + a * b + "  " + 
									(a + 1) + " * " + b + " = " + (a + 1) * b);
				}
			}
		}
	} // end main
} // end class