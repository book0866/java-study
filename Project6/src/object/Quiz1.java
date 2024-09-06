package object;

//object 패키지에 바로 문제1 클래스 생성
public class Quiz1 {

	public static void main(String[] args) {
		// 학생이 대중교통을 타고 학교에 가는 상황을 구현하세요.
		
		// 학생 두 명을 생성하세요. (둘리, 5000) (도우너, 10000)
		// 학생, 버스, 지하철의 현재 정보를 출력하세요.
				
		// 둘리는 100번 버스를 타고 학교에 갑니다.
		Student student1 = new Student("둘리", 5000);
						
		Bus bus = new Bus(100);
						
		student1.takeBus(bus);
						
		student1.showInfo();
		bus.showInfo();
		
				
		// 도우너는 2호선 지하철을 타고 학교에 갑니다.
		Student student2 = new Student("도우너", 10000);
		
		Subway subway = new Subway(2);
						
		student2.takeSubway(subway);
						
		student2.showInfo();
		subway.showInfo();
		
	}

}


