package downcasting.quiz;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 리스트를 하나 생성하세요.
		// 리스트에 사람, 호랑이, 독수리를 하나씩 추가하세요.
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(new Human());
		list.add(new Tiger());
		list.add(new Eagle());
		
		
		// 반복문으로 리스트에 저장된 요소를 하나씩 꺼내서
		// 사람이라면 readBook() 메소드를 호출하세요.
		// 사호랑이라면 hunting() 메소드를 호출하세요.
		// 독수리라면 fliyng() 메소드를 호출하세요.
		
//		for (int i = 0; i < list.size(); i++) {
//			
//			Animal animal = list.get(i);
			
		
		// 일반식보단 람다식이 좀 더 용이함
		for (Animal animal : list) {
		
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
				
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
				
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			
		}

	}

}


class Animal {
	
	public void move() {
		System.out.println("동물이 웁직입니다.");
	}
	
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
	
}











