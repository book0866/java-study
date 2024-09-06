package instance;

public class Ex3 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setStatus(true); // 현재 상태 변경
		car.showStatus(); // 현재 상태 출력
		
	}

}


// 자동차를 정의하는 클래스
class Car {
	
	boolean status; // 현재 상태 (주행 or 정지)
	
	// 현재 상태를 변경하는 메소드 선언
	public void setStatus(boolean stt) {
		status = stt;
	}
	
	// 현재 상태를 출력하는 메소드 선언
	public void showStatus() {
		System.out.println(status);
	}
}





