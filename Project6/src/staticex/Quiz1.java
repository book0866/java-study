package staticex;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 카드를 발급하는 프로그램을 구현하세요.
		
		// 카그(Card)를 정의하는 클래스를 만드세요.
		// 속성: 카드 번호
		// 카드 번호는 100번부터 시작하고 발급할 때마다 1씩 증가합니다.
		// 카드 3장을 생성하고, 각 카드의 번호를 출력하세요.(101, 102, 103)
		
		Card card1 = new Card();
		card1.showInfo();	
		
		Card card2 = new Card();
		card2.showInfo();		
		
		Card card3 = new Card();
		card3.showInfo();
		
		
	}

}


class Card {
	
	static int serialNum = 100; // 카드 번호
	int cardNo;
	
	public Card() {
		this.cardNo = serialNum; //카드번호에 시리얼번호를 대입
		serialNum++; // 증가된 값을 카드 번호에 부여
	}
	
	public void showInfo() {
		System.out.println("카드번호: " + cardNo);
	}
	
}












