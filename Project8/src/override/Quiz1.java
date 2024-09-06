package override;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 아래 그림은 동물과 고양이, 강아지 클래스의 상속관계를 표현한 것입니다.
		// 다음과 같이 클래스를 구현하고, 객체를 생성하세요.
		// 그리고 다음과 같이 결과가 출력되도록 메소드를 재정의하세요.
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.eat();
		cat.bark();
		dog.eat();
		dog.bark();
		
	}

}

class Animal {
	
	public void eat() {
		System.out.println("먹이를 먹는다.");
	}
	
	public void bark() {
		System.out.println("짖는다.");
	}
	
}



class Cat extends Animal {
	
	// 선언부 그대로, 구현부 변경
	@Override
	public void eat() {  // 선언부
		System.out.println("고양이는 쥐를 먹는다.");  // 구현부
	}

	@Override
	public void bark() {
		System.out.println("고양이는 야옹하고 짖는다.");
	}
	
}


class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("개는 고기를 먹는다.");
	}

	@Override
	public void bark() {
		System.out.println("개는 멍멍하고 짖는다.");
	}
	
}


























