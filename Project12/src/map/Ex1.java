package map;

import java.util.Collection;
import java.util.HashMap;

public class Ex1 {

	public static void main(String[] args) {
		
		// int형 키, String혈 Value를 저장하는 맵 생성
		HashMap<Integer, String> map = new HashMap<>(); // 제네릭 타입<>을 정해야 함(쌍구조이므로 두 개)
		
		// 데이터 추가
		map.put(1, "사과"); // key, value 쌍으로 값 추가
		map.put(2, "바나나");
		map.put(3, "코코넛");
		
		System.out.println("hashMap" + map);
		
		
		System.out.println("key: 1, value: " + map.get(1)); // index 대신 key(key에는 key값)
		System.out.println("key: 2, value: " + map.get(2));
		System.out.println("key: 3, value: " + map.get(3));
		
		
		// 데이터 수정하기
		map.replace(2, "블루베리"); // key값이 2인 요소의 값을 블루베리로 변경
		System.out.println("hashMap" + map);
		
		
		// 데이터 삭제하기
		map.remove(1); // key값이 1인 데이터 삭제
		System.out.println("hashMap" + map);
		
		
		// map 크기 구하기
		int size = map.size();
		System.out.println("map 크기: " + size);
		
		
		// 값 목록 조회
		Collection<String> values = map.values();
		System.out.println("값 목록: " + values);
		
		
		// 특정 key값이 존재하는지 확인하기
		if (map.containsKey(1)) {
			System.out.println("map에는 1이라는 키가 있습니다.");
		} else {
			System.out.println("map에는 1이라는 키가 없습니다.");
		}

	}

}















