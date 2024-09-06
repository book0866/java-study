package string;

public class Ex3 {

	public static void main(String[] args) {
		
		String str = "java";
		System.out.println("str의 주소: " + System.identityHashCode(str));
		str = str + " and";
		str= str + " android";
		System.out.println("값 변경 후 str의 주소: " + System.identityHashCode(str));
		System.out.println(str);
		System.out.println();
		
		
		// String 클래스는 값을 변경하면 문자열이 계속 생성돼서 메모리가 낭비됨
		// 문자열이 자주 변경된다면 StringBuilder를 사용할 것
		StringBuilder buffer = new StringBuilder("java");
		System.out.println("buffer의 주소: " + System.identityHashCode(buffer));
		buffer.append(" and");
		buffer.append(" android");
		System.out.println("값 변경 후 buffer의 주소: " + System.identityHashCode(buffer));
		System.out.println(buffer.toString());
		
	}

}
