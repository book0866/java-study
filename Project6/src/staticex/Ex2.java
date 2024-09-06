package staticex;

public class Ex2 {

	public static void main(String[] args) {
		
		
		
	}

}


class Student2 {
	
	private static int count = 0;
	int studentID;
	String studentName;
	
	public Student2() {
		count++;
		studentID = count;
	}
	
	public static int getCount() { // 값을 조회하는 메소드
		return count;
	}
	
	public static void setCount(int cnt) { // 값을 수정하는 메소드
		Student2.count = cnt;
		
//		studentName ="러버덕"; // static 메소드 안에서 인스턴스 변수 사용 불가(생성 시점이 빨라서 에러남)
	}
	
}






























