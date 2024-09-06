package main;

public class Ex4 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			
			arr[5] = 5;
			
		} catch (ClassCastException e) {
			
			System.out.println(e);
			
		} catch (ArithmeticException e) {

			System.out.println(e);
		
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
	}

}
