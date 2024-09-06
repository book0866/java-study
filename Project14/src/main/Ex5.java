package main;

public class Ex5 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			
			arr[5] = 5; // ArrayIndexOutOfBoundsException 에러 발생
			
		} catch (ClassCastException e) {
			
			System.out.println(e);
			
		} catch (ArithmeticException e) {

			System.out.println(e);
		
		} catch (Exception e) { // Exception형 매개변수를 사용하면, 모든 에러를 처리할 수 있음
								// Exception e = new ArrayIndexOutOfBoundsException
								// 어떤 타입의 에러인지 모를 때는 부모타입(Exception) 사용
			
			System.out.println(e);
			
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
	}

}
