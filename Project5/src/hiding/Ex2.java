package hiding;

// hiding 패키지 아래 Ex2 클래스
public class Ex2 {

	public static void main(String[] args) {
		
		MyDate2 date = new MyDate2();
		
		date.setMonth(2);
		date.setDay(30); // 틀린 값을 넣었을 때
		
		System.out.println("현재 날짜는 " + date.getMonth() + "월 " + date.getDay() + "일입니다.");
		
		
		date.setDay(10); // 맞는 값을 넣었을 때
		
		System.out.println("현재 날짜는 " + date.getMonth() + "월 " + date.getDay() + "일입니다.");
		
	}

}

class MyDate2 {
	
	private int month; // 월
	private int day; // 일
	
	// 월을 가져오는 메소드
	public int getMonth() { // getter: 리턴 O 매개변수 x (조회)
		return month;
	}
	
	// 월을 변경하는 메소드
	public void setMonth(int month) { // setter: 리턴 x 매개변수 O (수정)
		this.month = month;
	}
	
	
	// 일을 가져오는 메소드
	public int getDay() {
		return day;
	}
	
	// 일을 변경하는 메소드
	public void setDay(int day) {
		
		// 새로 들어온 값이 올바른 일자인지 확인하고 저장
		
		// 2월인 경우, 일자가 1보다 작거나 28보다 크다면 저장 안 함
		if (month == 2) {
			if (day < 1 | day > 28) {
				System.out.println("2월에는 " + day + "일이 없습니다.");
				return; // 값 반환 X 함수를 종료하는 용도
				
			}
		}
		
		this.day = day; // 교체하는 코드
		
	}
	
}







