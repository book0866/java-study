package innerclass;



// 외부 클래스
class Outer {
	
	private int a = 10;
	private static int b = 20;
	
	
	// 인스턴스 내부 클래스
	class InClass {
		
		int i1 = a; // 외부 클래스의 private 멤버도 사용 가능
		int i2 = b;
		
	}
	
	
	// 정적 내부 클래스
	static class InStaticClass {
		
//		int i1 = a; // 정적 클래스에서 인스턴스 변수 사용 불가(생명주기가 다름)
		int i2 = b; // static에서 static 사용은 ㅇㅋ
		
	}
	
	
}



