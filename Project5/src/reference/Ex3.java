package reference;

public class Ex3 {

	public static void main(String[] args) {
		
		int num = 10;
		method1(num);
		System.out.println(num);
		
		Subject math = new Subject("수학", 100);
		method2(math);
		System.out.println(math.scorePoint);
		
	}
	
	
	// 기본형 매개변수
	public static void method1(int n) {
		
		n = 5;
		
	}
	
	
	// 참조형 매개변수
	public static void method2(Subject sub) {
		
		sub.scorePoint = 50;
		
	}

}
