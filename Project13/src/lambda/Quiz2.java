package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 1) Hello의 구현 클래스를 만들고, helloPrint()를 호출하세요.
		Hello hello1 = new HelloImpl();
		
		hello1.helloPrint();
		
		
		// 2) Hello의 익명 클래스를 구현하고, helloPrint()를 호출하세요.
		Hello hello2 = new Hello() {
			
			@Override
			public void helloPrint() {
				System.out.println("안녕하세요~ 감사해요~ 잘 있어요~ 다시 만나요~");
			}
		};
		
		hello2.helloPrint();
		
		
		// 3) Hello의 람다식 함수로 구현하고, helloPrint()를 호출하세요.
		Hello hello3 = () -> System.out.println("안녕하세요~ 감사해요~ 잘 있어요~ 다시 만나요~");
		
		hello3.helloPrint();
		
	}

}


// 함수형 인터페이스 선언
interface Hello {
	
	// "안녕하세요."를 출력하는 함수
	void helloPrint();
	
}


class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요~ 감사해요~ 잘 있어요~ 다시 만나요~");
	}
	
}








