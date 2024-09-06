package arraylist.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 논리형(Boolean)의 리스트를 생성하세요.
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		// 값 3개를 추가하세요.(true, true, false)
		list.add(true);
		list.add(true);
		list.add(false);
		
		// 반복문을 사용하여 리스트의 모든 요소를 출력하세요.(일반 for문)
		for (int i = 0; i < list.size(); i++) {
			Boolean b = list.get(i);
			System.out.print(b + " ");
		}
		
		// 람다식 for문
//		for (boolean bool : list) {
//			System.out.println(bool + " ");
//		}
		
		// 리스트의 첫 번째 요소와 마지막 요소를 출력하세요.
		int lastIndex = list.size() -1;
		
		list.get(0);
		list.get(lastIndex);
		
		//
		
		Boolean num1 = list.get(0);
		Boolean num2 = list.get(2);
		
		System.out.println();
		System.out.print(num1 + " ");
		System.out.print(num2);

	}

}
