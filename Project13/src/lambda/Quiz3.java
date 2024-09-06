package lambda;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 1) StringConverter의 구현 클래스를 만들고, converter()를 호출하세요.
		
		StringConverter stringConverter1 = new MyStringConverter();
		
		System.out.println(stringConverter1.converter("Hello"));
		
		
		// 2) StringConverter의 익명 클래스를 구현하고, converter()를 호출하세요.
		StringConverter stringConverter2 = new StringConverter() {
			
			@Override
			public String converter(String s) {
				return s.toUpperCase();
			}
		};

		System.out.println(stringConverter2.converter("Hello"));
		
		
		// 3) StringConverter의 람다식 함수로 구현하고, converter()를 호출하세요.
		StringConverter stringConverter3 = s -> s.toUpperCase();
		
		System.out.println(stringConverter3.converter("Hello"));
		
		
	}

}


//함수형 인터페이스 선언
interface StringConverter {
	
	// 문자열을 대문자로 변환해서 반환하는 함수
	String converter(String s);
	
}


class MyStringConverter implements StringConverter {

	@Override
	public String converter(String s) {
		return s.toUpperCase();
	}
	
}




















