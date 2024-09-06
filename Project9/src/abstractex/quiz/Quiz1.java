package abstractex.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 아래 그림은 자동차, 아반떼, 소나타 클래스의 상속관계를 표현한 것입니다.
		// 다음과 같이 클래스를 구현하고, 객체를 생성하세요.
		// 그리고 다음과 같이 결과가 출력되도록 메소드를 재정의하세요.
		
		Car car1 = new Avante();
		car1.start();
		car1.drive();
		car1.stop();
		car1.turnoff();
		System.out.println();
		Car car2 = new Sonata();
		car2.start();
		car2.drive();
		car2.stop();
		car2.turnoff();
		
	}

}

abstract class Car {
	
	public abstract void start();
	
	public abstract void drive();

	public abstract void stop();
	
	public abstract void turnoff();
	
}


class Avante extends Car {

	@Override
	public void start() {
		System.out.println("Avante 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("Avante 시동을 끕니다.");
	}
	
}



class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("Sonata 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("Sonata 시동을 끕니다.");
	}
	
}




















