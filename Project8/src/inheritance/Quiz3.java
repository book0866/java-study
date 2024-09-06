package inheritance;

public class Quiz3 {

	public static void main(String[] args) {

		//  아래 그림은 펜과 볼펜,만년필 클래스의 상속관계를 표현한 것입니다.
		//  다음과 같이 클래스를 구현하고, 객체를 생성하세요.
		
		Ballpen ballpen = new Ballpen();
		
		ballpen.width = 2;
		ballpen.remains = 100;
		ballpen.color = "Deepgreen";
		
		
		Fountainpen fountainpen = new Fountainpen();
		
		fountainpen.width = 3;
		fountainpen.remains = 80;
		fountainpen.brand = "Montblanc";
		
	}

}

//펜 클래스
class Pen {
	
	int width; // 펜의 굵기
	int remains; // 남은 양
	
}


class Ballpen extends Pen {
	
	String color;
	
}


class Fountainpen extends Pen {
	
	String brand;
	
}




