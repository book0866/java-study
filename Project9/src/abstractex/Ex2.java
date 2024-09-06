package abstractex;

public class Ex2 {

	public static void main(String[] args) {
		
		// 형변환(부모 타입 = 자식 타입)
		Animal animal1 = new Cat();
		animal1.sound();
		
		Animal animal2 = new Dog();
		animal2.sound();
		
	}

}

// 동물 클래스
abstract class Animal {
	
	// 공통 기능은 일반메소드로 선언
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 동물이 내는 소리는 전부 다르니까 추상메소드로 선언
	public abstract void sound();
	
}


// 고양이 클래스
class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("앩욹");
	}
	
}


// 강아지 클래스
class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("꾸릉");
	}
	
}

















