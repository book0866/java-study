package string.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 1. 문자열 "a:b:c:d"를 만드세요.
		// 그리고 문자열을 "A#B#C#D"로 변경하세요.
		String str1 = "a:b:c:d";
		String str2 = str1.replace(":", "#");
		System.out.println(str2);
		
		
		// 2. "안녕하세요. 저는 러버덕입니다."라는 문자열을 만드세요.
		// 그리고 문자열에서 "러버덕" 부분만 추출하세요.
		String str3 = "안녕하세요. 저는 러버덕입니다.";
		System.out.println(str3.indexOf("러"));
		System.out.println(str3.substring(10, 13));
		
	}

}
