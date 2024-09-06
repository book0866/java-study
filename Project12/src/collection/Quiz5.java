package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz5 {

	public static void main(String[] args) {
		
		// 정수 타입의 HashSet 생성하세요.
		// set에 숫자 3개를 추가하세요.
		// set의 크기를 출력하세요.
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(5);
		
		System.out.println(hashSet);
		System.out.println("set의 크기: " + hashSet.size());
		
		
		// Iterator를 이용하여 set의 요소를 하나씩 출력하세요.
		Iterator<Integer> ir = hashSet.iterator();
		
		while (ir.hasNext()) {
			int num = ir.next();
			System.out.print(num + " ");
		}
		System.out.println();
		
		// 람다식 for문을 이용하여 set의 요소를 하나씩 출력하세요.
		for(int num : hashSet) {
			System.out.print(num + " ");
		}

	}

}







