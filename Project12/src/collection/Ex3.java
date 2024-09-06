package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		
		// HashSet 선언 및 생성
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("러버덕"); // 회원 추가
		hashSet.add("스탠리");
		hashSet.add("로토무");
		hashSet.add("로토무"); // 중복된 값은 추가 불가
		
		System.out.println("set 목록: " + hashSet + " | 크기: " + hashSet.size()); //추가된 순서와 상관없이 출력됨
		
		
		hashSet.remove("로토무"); //리스트와 삭제 방법이 다름. 순서가 없는 set은 인덱스가 없으므로 인자로 회원이름을 넣음
		System.out.println("set 목록: " + hashSet + " | 크기: " + hashSet.size());
		
		
		// Iterator 객체 생성
		Iterator<String> ir = hashSet.iterator();
		
		while (ir.hasNext()) { // 다음 요소가 있으면
			String member = ir.next(); // 다음 요소를 가져옴
			System.out.print(member + " ");
		}
		
		// 람다식 for문
		for(String member : hashSet) {
			System.out.print(member + " ");
		}
		
	}

}













