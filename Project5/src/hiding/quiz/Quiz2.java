package hiding.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		// Car 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
		// 이때, 자동차의 정보는 setter를 사용해서 변경하세요.
		// (현대, 소나타, 흰색, 200)
		// 자동차의 정보는 getter를 사용해서 출력하세요.
		Car car = new Car();
		
		car.setCompany("현대");
		car.setModel("소나타");
		car.setColor("흰색");
		car.setSpeed(200);
		
		System.out.println("제조사: " + car.getCompany() + " 모델명: " + car.getModel() + " 색: " + car.getColor() + " 최고 속도: " + car.getSpeed());
		
	}

}

// 자동차(Car)를 정의하는 클래스를 만드세요.
//속성: 제조사, 모델명, 색, 최고속도 *private
//기능: 각 멤버변수의 getter와 setter
class Car {
	
	private String company;
	private String model;
	private String color;
	private int speed;
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}





