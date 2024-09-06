package wrapper.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 문자열을 숫자로 변환하려면 "parse" 메소드를 사용해야 함
		// 또는 valueOf 함수 사용하기
		
		// 문자열 "10"을 byte, short, int, long으로 변환하세요.
		byte num1 = Byte.parseByte("10"); // "10" -> 10
		short num2 = Short.parseShort("10");
		int num3 = Integer.parseInt("10");
		long num4 = Long.parseLong("10");
		System.out.println();
		
		// 문자열 "100"을 float, double로 변환하세요.
		Float num5 = Float.parseFloat("100.0"); // "100.0" -> 100.0
		double num6 = Double.parseDouble("100.0");
		System.out.println();
		
	}

}
