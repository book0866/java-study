package hiding.test2;

import hiding.test1.A;

public class Test {

	public static void main(String[] args) {
		
		A a = new A(); // 접근제어자가 public으로 되어 있어서 외부 패키지에서 사용 가능(마우스 올려서 import문 선택)
		
//		B b = new B(); // 접근제어자가 default로 되어 있어서 외부 패키지에서 사용 불가(import문 안 뜸)
		
		
	}

}
