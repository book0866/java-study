package object;

public class Quiz2 {

	public static void main(String[] args) {
		
		//  <다운캐스팅 복습>
		//
		//  3번째 예제에서 작성한 Student클래스를 재사용하세요.
		//  Object형 변수를 선언하고 Student객체를 대입하세요.
		//  Object형 변수를 사용해서 학번과 이름을 출력하세요.
		
		// Object는 모든 클래스의 부모이기 때문에 형변환 가능
		// 하지만 Object 타입 변수로는 학생의 정보를 사용할 수 없음
		Object obj = new Student(1001, "러버덕");
		
		// 다운캐스팅 진행
		if (obj instanceof Student) { // 타입 체크 필수
			Student student = (Student) obj; // 원래 타입으로 변경
			
			System.out.println("학번: " + student.id);
			System.out.println("이름: " + student.name);
		}
		
	}

}
