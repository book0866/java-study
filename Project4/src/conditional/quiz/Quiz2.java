package conditional.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		//정수형 변수 age를 선언하고 나이를 대입하세요.
		int age = 30;
		
		// 문자형 변수 gender를 선언하고 성별을 F 또는 M으로 대입하세요.
		char gender = 'F';
		
		// 나이가 8살 이상이고 성별이 여자라면 "여학생입니다."를 출력하세요.
		if ((age >= 8) && (gender == 'F')) {    // ctrl + space로 자동 완성(변수 기입할 자리에서)
			System.out.println("여학생입니다.");
		}
		
	}

}
