package polymorphism.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 아래 그림은 자동차와 버스, 스포츠카 클래스의 상속관계를 표현한 것입니다.
		// 다음과 같이 클래스를 구현하세요. 
		// 그리고 테스트용 클래스에 runCar 메소드()를 만들어서 다음과 같이 결과를 출력하세요.
		
		runCar(new Bus()); // Car car = new Bus()
		runCar(new SportsCar()); // Car car = new SportsCar()
		
	}
	
	public static void runCar(Car car) {
		car.run();
	}
	

}


class Car {
	
	public void run() {
		System.out.println("주행한다.");
	}
	
}


class Bus extends Car {

	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
	
}



class SportsCar extends Car {

	@Override
	public void run() {
		System.out.println("스포츠카가 달린다.");
	}
	
}










