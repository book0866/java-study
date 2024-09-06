package scope;

// 인스턴스변수, 클래스변수 / 전역변수, 지역변수
// 구분에 따라 변수의 유효범위를 작성하세요.
class Person {
	
	// 인스턴스변수: 객체 생성과 동시에 사용 가능
	// 전역변수: 클래스 안 어디서든 사용 가능
	String personName; 
	int personAge; 
	
	// 클래스변수: 프로그램이 실행될 때부터 사용 가능
	static char gender = 'F'; 
	
	// 지역변수: 함수 안에서만 가용 가능(함수 끝나면 소멸)
	public void setPersonName(String name) { 
		this.personName = name;
	}
	
}
