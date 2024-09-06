package override;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 아래 그림은 커피과 아메리카노, 카페라떼 클래스의 상속관계를 표현한 것입니다.
		// 다음과 같이 클래스를 구현하고, 객체를 생성하세요.
		// 그리고 다음과 같이 결과가 출력되도록 메소드를 재정의하세요.
		Coffee coffee1 = new Coffee();
		coffee1.taste();
		
		Coffee americano = new Americano();
		americano.taste();
		
		Coffee cafeLatte = new CafeLatte();
		cafeLatte.taste();
		
	}

}

class Coffee {
	
	public void taste() {
		System.out.println("커피를 마신다.");
	}
	
}


class Americano extends Coffee {

	@Override
	public void taste() {
		System.out.println("아메리카노를 마신다.");
	}
	
}


class CafeLatte extends Coffee {

	@Override
	public void taste() {
		System.out.println("카페라떼를 마신다.");
	}
	
}





















