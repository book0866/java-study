package inheritance;

public class Ex1 {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.nationality = "한국"; // 부모 클래스에서 물려받은 속성
		child.lastName = "러"; // 부모 클래스에서 물려받은 속성
		child.firstName = "버덕";
		
	}

}

// 부모 클래스
class Parent {
	
	String nationality; // 국적
	String lastName; // 성
	
}

// 자식 클래스
class Child extends Parent {
	
	String firstName; // 이름
	
}


















