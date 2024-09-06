package typecasting;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 아래 그림은 부모와 자식 클래스의 상속관계를 표현한 것입니다.
		// 다음과 같이 클래스를 구현하고, 객체를 생성하세요.
		// 단, 부모클래스 참조변수를 선언하고 자식 클래스로 생성한 인스턴스를 대입하세요.
		// 그리고 자식클래스의 정보를 출력하세요.
		
		Parent child = new Child("한국", "러", "버덕");
		
//		Child child = new Child("한국", "러", "버덕"); // 이것도 됨
		
		System.out.println(child.nationality);
		System.out.println(child.lastName);

	}

}

class Parent {
	
	String nationality;
	String lastName;
	
	public Parent(String nationality, String lastName) {
		super();
		this.nationality = nationality;
		this.lastName = lastName;
	}
	
}


class Child extends Parent {
	
	String firstName;

	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
	}

}










