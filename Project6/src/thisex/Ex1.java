package thisex;

public class Ex1 {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		
		bDay.setYear(2000);
		
		System.out.println(bDay);
		bDay.printThis();
		// 같은 주소값 출력
		
	}

}

// 생일 클래스
class BirthDay {
	
	int year; // 1) 속성(자기자신)을 의미하는 year
	
	// 태어난 연도를 변경하는 메소드
	public void setYear(int year) {
		this.year = year; // 2) 매개변수 역할을 하는 year (이름이 같을 경우 this 키워드를 붙여 구분)
	}
	
	// this의 값을 출력하는 메소드
	public void printThis() {
		System.out.println(this);
	}
}



