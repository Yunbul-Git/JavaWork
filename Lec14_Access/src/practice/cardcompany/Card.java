package practice.cardcompany;

public class Card {
	private int cardNum = 10000;
	// 필요한 변수, 메소드, 생성자 정의하기
	public Card() {
		
	}
	
	public int getCardNumber() {
		cardNum = cardNum + Company.countCard();
		return cardNum;
	}
} // end class
