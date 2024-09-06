package instance.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		// 다음과 같이 사람 클래스(Person)를 정의하세요.
		// 속성: 이름, 나이, 결혼 여부, 자식 수
		
		// 그리고 Person 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
		// 이름: James  나이: 40세  결혼 여부: O  자신 수: 3
		
		Person person = new Person();
		
		person.name = "James";
		person.age = 40;
		person.married = true;
		person.child = 3;

	}

}

// 파일 하나에 Person 클래스를 만들 경우 main 함수 밖에 만들기

//class Person {  // 이 경우 public(접근제어자) 생성 불가
//	
//	// 이름, 나이, 결혼 여부, 자식 수
//	String name;
//	int age;
//	boolean married;
//	int child;

