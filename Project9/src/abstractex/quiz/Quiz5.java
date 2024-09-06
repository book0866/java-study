package abstractex.quiz;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		
		// 동물 클래스 타입의 리스트를 생성하세요.
		// 리스트에 사람과 호랑이 객체를 추가하세요.
		// 리스트 안에 저장된 객체를 꺼내서, 객체가 가지고 있는 모든 메소드를 호출하세요.
		
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(new Human());
		list.add(new Tiger());
		
		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			animal.sleep();
			animal.move();
			
			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBook();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			}
			
			System.out.println();
			
		}

	}

}
