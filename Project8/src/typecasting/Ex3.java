package typecasting;

public class Ex3 {

	public static void main(String[] args) {
		
		// class 형변환
		// 부모타입 변수 = 자식 인스턴스 생성
		Customer2 vc = new VIPCustomer2("러버덕");
		
		// class 형변환의 제약사항: vc 변수는 Customer2(부모) 클래스가 물려준 멤버변수와 메소드만 사용할 수 있음
		
	}

}
