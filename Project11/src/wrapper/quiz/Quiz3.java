package wrapper.quiz;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		// <래퍼 클래스를 사용한 리스트 생성하기>
		
		// 문자를 저장하는 리스트를 생성하고 'a','b','c','d' 를 저장하세요.
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a'); // -> list.add(new Character('a'))로 변환(오토박싱)
		list.add('b');
		list.add('c');
		list.add('d');
		
		// 그리고 리스트 안에 저장된 모든 문자를 꺼내서 출력하세요.
		// 오토박싱, 언박싱이 발생한 부분을 찾아서 주석을 달아보세요~
		for (int i = 0; i < list.size(); i++) {
			char ch = list.get(i); // -> list.get(i).charValue()로 변환(언박싱)
			System.out.println(ch);
		}

	}

}
