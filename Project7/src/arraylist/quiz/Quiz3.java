package arraylist.quiz;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		// 문자열형(String) 리스트를 생성하세요.
		ArrayList<String> list = new ArrayList<String>();

		// 문자열 5개를 추가하세요.("AA", "BB", "CC", "DD", "EE")
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");

		// 반복문을 사용하여 리스트의 요소를 출력하세요.
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.print(s + " ");
		}

		System.out.println();

		// 리스트에 저장된 모든 문자열을 삭제하세요.

		list.remove(0); 
		list.remove(0);
		list.remove(0);
		list.remove(0);
		list.remove(0);
		
		// 위랑 아래 둘 중 뭘로 해도 ok
		
//		list.remove(4);
//		list.remove(3);
//		list.remove(2);
//		list.remove(1);
//		list.remove(0);

		System.out.print("배열 요소의 수: " + list.size() + "개");

	}

}
