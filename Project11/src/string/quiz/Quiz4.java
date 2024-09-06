package string.quiz;

public class Quiz4 {
		
	 public static void main(String[] args) {
		 
		// 이전 문제를 함수 형태로 바꾸고 호출하세요.
		// ex) getCharCount("자바 프로그래밍 입문") -> 9
		// ex) getCharCount("equals 메소드는 두 객체가 같은지 비교한다.") -> 22
		
		int result = getCharCount("자바 프로그래밍 입문");
		System.out.println(result);
		
		int result2 = getCharCount("equals 메소드는 두 객체가 같은지 비교한다.");
		System.out.println(result2);
		 
	 }
	 
		static int getCharCount(String j) {
			
			int leng = 0;
			
			for (int i = 0; i < j.length(); i++) {
				
				if (j.charAt(i) != ' ')
					leng++;
				
			}
			
			return leng;
				
		}
		
}















