package object;

// object 패키지 생성 - 예제1
public class Ex1 {

	public static void main(String[] args) {
		
		// 1) 10000원을 가진 러버덕이라는 학생을 만든다. (객체 만들기)
		Student student = new Student("러버덕", 10000);
		
		// 2) 100번 버스를 만든다. (상황 구현)
		Bus bus = new Bus(100);
		
		// 3) 학생이 100번 버스에 탄다. 
		student.takeBus(bus);
		
		student.showInfo();
		bus.showInfo();
		
	}

}


class Bus {
	
	int busNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 수입
	
	// 버스 번호를 초기화하는 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	// 버스에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money; // 버스 수입 증가
		passengerCount++;// 승객 수 1명 증가
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원입니다.");
	}
	
}


class Subway {
	
	int lineNumber; // 노선 번호
	int passengerCount; // 승객 수
	int money; // 수입
	
	// 노선 번호를 초기화하는 생성자
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 지하철에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money; // 수입 = 수입 + 요금
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "번 노선 지하철의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원입니다.");
	}
	
}

class Student {
	
	String studentName; // 학생 이름
	int money; // 소지금
	
	// 학생 이름과 가진 돈을 초기화하는 생성자
	// (source - generate로 자동 생성)
	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	// 버스에 타서 요금을 지불하는 메소드
	public void takeBus(Bus bus) { // (매개변수)로 객체를 받아야 함
		bus.take(1000); // 1000원 지불
		this.money = this.money - 1000; // 가진 돈 1000원을 잃음
		
	}
	
	
	// 지하철에 타서 요금을 지불하는 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500); // 1500원을 지불
		this.money = this.money - 1500; // 가진 돈 1500원을 잃음
	}
	
	// 학생의 현재 소지금
	public void showInfo() {
		System.out.println(studentName + "의 남은 돈은 " + money + "원입니다.");
	}
	
}

















