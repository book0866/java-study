package abstractex.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 아래 그림은 자동차, 버스, 오토카 클래스의 상속관계를 표현한 것입니다.
		// 다음과 같이 클래스를 구현하고, 객체를 생성하세요.
		// 그리고 다음과 같이 결과가 출력되도록 메소드를 재정의하세요.
		
		Bus bus = new Bus();
		bus.run();
		bus.refuel();
		bus.takePassenger();
		System.out.println();
		AutoCar autoCar = new AutoCar();
		autoCar.run();
		autoCar.refuel();
		autoCar.load();

	}

}

abstract class Car1 {
	
	public abstract void run();
	
	public abstract void refuel();
	
}


class Bus extends Car1 {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전합니다.");
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
	
}


class AutoCar extends Car1 {

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
	
}




















