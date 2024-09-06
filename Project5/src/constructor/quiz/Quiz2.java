package constructor.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 모든 생성자를 사용하여 두 개의 인스턴스를 생성하고 모든 값을 초기화하세요
		// (현대, 소나타, 흰색, 200)
		// (기아, 레이, 검정색, 150)
		
		// 디폴트 생성자
		Car car1 = new Car();
		
		car1.company = "현대";
		car1.model = "소나타";
		car1.color = "흰색";
		car1.speed = 200;
		
		
		// 모든 멤버변수를 입력받는 생성자
		Car car2 = new Car("기아", "레이", "검정색", 150);
		
	}
	
}

// 자동차(Car)를 정의하는 클래스를 만드세요.
// 속성: 제조사, 모델명, 색, 최고 속도
// 생성자: 디폴트 생성자, 모든 멤버변수를 입력받는 생성자

class Car {
	
	String company;
	String model;
	String color;
	int speed;
	
	
	public Car() {
		super();
	}

	public Car(String company, String model, String color, int speed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
}




