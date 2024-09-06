package abstractex.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 아래 그림은 동물, 사람, 호랑이 클래스의 상속관계를 표현한 것입니다.
		// 다음과 같이 클래스를 구현하고, 객체를 생성하세요.
		// 그리고 다음과 같이 결과가 출력되도록 메소드를 재정의하세요.
		Human human = new Human();
		human.sleep();
		human.move();
		human.readBook();
		System.out.println();
		Tiger tiger = new Tiger();
		tiger.sleep();
		tiger.move();
		tiger.hunting();

	}

}


abstract class Animal {
	
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}
	
	public abstract void move();
	
}


class Human extends Animal {

	@Override
	public void move() { // 물려받은 추상메소드 구현
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}


class Tiger extends Animal {

	@Override
	public void move() { // 물려받은 추상메소드 구현
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}
















