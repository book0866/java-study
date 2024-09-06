package object;

public class Quiz2 {

	public static void main(String[] args) {
		// 학생이 택시에 타는 과정을 구현하세요.
		
		// 2만원을 가진 둘리가 택시를 타고 학교에 갑니다.
		// 택시 요금은 1만원을 지불했습니다.
		// 단, 소지금이 만원보다 적으면 택시에 탈 수 없습니다.

		Student2 student2 = new Student2("둘리", 50000);
		
		Taxi taxi = new Taxi();
						
		student2.takeTaxi(taxi);
						
		student2.showInfo();
		taxi.showInfo();
	}

}


class Taxi {
	
	int money; // 수입
	
	// 택시에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money; // 택시 수입 증가
	}
	
	public void showInfo() {
		System.out.println("택시의 수입은 " + money + "원입니다.");
	}
	
}



class Student2 {
	
	String studentName; // 학생 이름
	int money; // 소지금
	
	// 학생 이름과 가진 돈을 초기화하는 생성자
	// (source - generate로 자동 생성)
	public Student2(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	// 택시에 타서 요금을 지불하는 메소드
	public void takeTaxi(Taxi taxi) { // (매개변수)로 객체를 받아야 함
		
		if (money < 10000) {
				System.out.println("소지금이 만원보다 적으면 택시에 탈 수 없습니다.");
				return; // 값 반환 X 함수를 종료하는 용도
		}
		
		taxi.take(10000); // 10000원 지불
		this.money = this.money - 10000; // 가진 돈 10000원을 잃음
	
	}

	
	// 학생의 현재 소지금
	public void showInfo() {
		System.out.println(studentName + "의 남은 돈은 " + money + "원입니다.");
	}
	
}


