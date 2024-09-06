package abstractex.quiz;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 자동차 클래스 타입의 리스트를 생성하세요.
		// 리스트에 버스과 오토카 객체를 추가하세요.
		// 리스트 안에 저장된 객체를 꺼내서, 객체가 가지고 있는 모든 메소드를 호출하세요.
		
		ArrayList<Car1> list = new ArrayList<>();
		
		list.add(new Bus());
		list.add(new AutoCar());
		
		for (int i = 0; i < list.size(); i++) {
			Car1 car = list.get(i);
			
			car.run();
			car.refuel();
			
			if (car instanceof Bus) {
				Bus bus = (Bus) car;
				bus.takePassenger();
			} else if (car instanceof AutoCar) {
				AutoCar autoCar = (AutoCar) car;
				autoCar.load();
			}
			
			System.out.println();
			
		}
		
	}

}







