package override;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 아래 그림은 컴퓨터과 노트북, 데스크탑 클래스의 상속관계를 표현한 것입니다.
		// 다음과 같이 클래스를 구현하고, 객체를 생성하세요.
		// 그리고 다음과 같이 결과가 출력되도록 메소드를 재정의하세요.
		
		Computer computer = new Computer();
		computer.on();
		computer.off();
		
		Computer notebook = new Notebook();
		notebook.on();
		notebook.off();
		
		Computer desktop = new Desktop();
		desktop.on();
		desktop.off(); 

	}

}


class Computer {
	public void on() {
		System.out.println("컴퓨터를 켭니다.");
	}
	
	public void off() {
		System.out.println("컴퓨터를 끕니다.");
	}
}


class Notebook extends Computer {

	@Override
	public void on() {
		System.out.println("노트북을 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("노트북을 끕니다.");
	}
	
}


class Desktop extends Computer {

	@Override
	public void on() {
		System.out.println("데스크탑을 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("데스크탑을 끕니다.");
	}
	
}


























