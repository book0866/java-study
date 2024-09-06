package arraylist;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		for (int i = 0; i < list.size(); i++) { // 배열은 length, 리스트는 size
			
			int num = list.get(i); // i를 인덱스로 활용
			System.out.print(num + " ");
			
		}
		
	}

}
