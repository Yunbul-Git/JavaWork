package practice.cardcompany;

public class Company {
	static int cntCard = 0;
	private Company() {

	}

	public Card createCard() {
		Card num = new Card();
		return num;
	}
	public static int countCard() {
		cntCard++;
		return cntCard;
	}

	private static Company instance = null;

	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	// 필요한 변수, 메소드, 생성자 정의하기

} // end class
