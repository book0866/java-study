package arraylist.quiz;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 문자형(Character) 리스트를 생성하세요.
		// 문자 3개를 추가하세요('A', 'B', 'C')
		// 리스트의 모든 요소를 출력하세요.
		
		// 1) 문자 타입 리스트 생성
		// char -> Character
		ArrayList<Character> list = new ArrayList<Character>();
		
		// 2) 리스트에 데이터 추가(add
		list.add('A');
		list.add('B');
		list.add('C');
		
		// 3) 리스트에서 요소를 하나씩 꺼내기(꺼낼 땐 get 메소드에 인덱스())
		char ch1 = list.get(0); // 기초타입(char 등) 써도 되고 wrapper타입(Character 등) 써도 됨
		System.out.print(ch1 + " ");
		
		char ch2 = list.get(1);
		System.out.print(ch2 + " ");
		
		char ch3 = list.get(2);
		System.out.print(ch3);
		
	}
	
	

}









