package scope;

// 접근제어자에 따라 변수의 사용 범위를 작성하세요.
class A {
	
	public int field1; // 다른 클래스에서 사용 가능
	int field2; // 같은 패키지 내에서 사용 가능
	private int field3; // 같은 클래스 안에서만 사용 가능
	
}
