package string.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		// "자바 프로그래밍 입문"이라는 문자열을 만드세요.
		// 공백을 제외한 글자 수만 세어서 출력하세요. => 배열의 요소를 하나씩 꺼내서 공백인지 확인하세요.
		// ex) "자바 프로그래밍 입문" -> 9(전체: 11, 공백: 2)
		
		String java = "자바 프로그래밍 입문";
		
		int leng = 0;
		
		System.out.println(java.length()); // 전체 글자 수
		
		for (int i = 0; i < java.length(); i++) {
			
			if (java.charAt(i) != ' ') { // 공백이 아니면 숫자 증가
				leng++;
			}
			
		}
		
		System.out.println(leng); // 공백 제외 문자 수
		
	}

}
