package innerclass;

	
	
class A {
	
	int num = 10;
}

class B {
	
	void method() {
		A a = new A(); // 인스턴스 생성
		System.out.println(a.num);
		// B 클래스에서 A 클래스의 멤버를 사용하려면 객체(인스턴스)를 생성해야 함
	}
}


// 외부 클래스
class C {
	
	int num = 10;
	
	
	// 내부 클래스
	class D {
		
		void method() {
			System.out.println(num);
		}
		
		// 별도의 객체(인스턴스) 생성할 필요 없이도 외부 클래스의 멤버 사용 가능
		
	}
	
	
}






















