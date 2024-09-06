package wrapper;

public class Ex2 {

	public static void main(String[] args) {
		
		// Tnteger의 객체 생성
		Integer iNum1 = new Integer(100);
		
		// 자바 버전이 올라가면서 생상자 생략
		Integer iNum2 = 100; // new Integer(100);으로 변환됨(오토박싱)
		
		// Integer 객체에서 값 꺼내기
		int num1 = iNum1.intValue();
		int num2 = iNum1; // iNum1.intValue();로 변환됨(언박싱)
		
		// 참조형과 기본형 간의 영상 가능
		int num3 = iNum1 + 100; // iNum1.intValue() + 100 -> 100 + 100
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println();
		
		
		// Boolean 클래스
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = false; // 오토박싱으로 객체 생성
		
		boolean bool1 = boolean1.booleanValue(); // boolean 값 꺼내기
		boolean bool2 = boolean2; // 언박싱으로 값 꺼내기
		
		System.out.println("bool1: " + bool1);
		System.out.println("bool2: " + bool2);
		System.out.println();
		
		
		// Character 클래스
		Character character1 = new Character('A');
		Character character2 = 'B'; // 오토박싱으로 객체 생성
		
		char char1 = character1.charValue(); // char 값 꺼내기
		char char2 = character2; // 언박싱으로 값 꺼내기
		
		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
		
	}

}









