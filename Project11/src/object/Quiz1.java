package object;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 연도, 월, 일을 멤버로 가지는 Date 클래스를 만드세요.
		// 날짜의 내용을 같은지 비교하도록 equals 메소드를 재정의하세요.
		
		// 다음과 같이 인스턴스를 생성하고, 비교하세요.
		// MyDate date1 = new MyDate(2024, 7, 22);
		// MyDate date2 = new MyDate(2024, 7, 22);
		// date1.equals(date2) --> true
		
		// 다음과 같이 인스턴스를 생성하고, 비교하세요.
		// MyDate date3 = new MyDate(2024, 7, 21);
		// MyDate date4 = new MyDate(2024, 7, 22);
		// date3.equals(date4) --> false
		
		// 비교연산자로 비교
		MyDate date1 = new MyDate(2024, 7, 22);
		MyDate date2 = new MyDate(2024, 7, 22);
		date1.equals(date2);
		
		if (date1.equals(date2)) {
			System.out.println("date1과 date2의 날짜는 같습니다.");
		} else {
			System.out.println("date1과 date2의 날짜는 다릅니다.");
		}
		
		// equals 메소드로 비교
		MyDate date3 = new MyDate(2024, 7, 21);
		MyDate date4 = new MyDate(2024, 7, 22);
		date3.equals(date4);
		
		if (date3.equals(date4)) {
			System.out.println("date3과 date4의 날짜는 같습니다.");
		} else {
			System.out.println("date3과 date4의 날짜는 다릅니다.");
		}
		
	}

}


class MyDate {
	
	int year;
	int month;
	int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) { // Object를 상속했으니 매개변수도 Object타입
		
		if(obj instanceof MyDate) {
			
			MyDate date = (MyDate) obj; // 다운캐스팅
			if(this.year == date.year && this.month == date.month && this.day == date.day) { // 논리곱(&&)을 사용
				return true;
			}
			
		}
		return false;
	}
	
}
















