package hiding;

//hiding 패키지 아래 Ex1 클래스
public class Ex1 {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		date.month = 2;
		date.day = 31;
		System.out.println("현재 날짜: " + date.month
							+ "월 " + date.day + "일");
		
		// public 변수는 논리적으로 잘못된 값이 저장되는 것을 막을 수 없음
		
	}

}

class MyDate {
	
	public int month; // 월
	public int day; // 일
	
}
