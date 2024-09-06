package inheritance;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 호랑이 인스턴스를 생성하세요.(다리 4개, 꼬리 1개)
		Tiger tiger = new Tiger();
		
		tiger.leg = 4; // 부모 클래스에서 물려받은 속성
		tiger.tail = 1;
		
		
		// 독수리 인스턴스를 생성하세요.(다리 2개, 날개 2개)
		Eagle eagle = new Eagle();
		
		eagle.leg = 2; // 부모 클래스에서 물려받은 속성
		eagle.wing = 4;

	}

}

//동물(Animal)을 정의하는 클래스를 만드세요.
// 속성: 다리
class Animal {
	
	int leg;
	
}


// 동물 클래스를 상속받는 호랑이(Tiger) 클래스를 만드세요
// 속성: 꼬리
class Tiger extends Animal {
	
	int tail;
	
}


// 동물 클래스를 상속받는 독수리(Eagle) 클래스를 만드세요.
// 속성: 날개
class Eagle extends Animal {
	
	int wing;
	
}





