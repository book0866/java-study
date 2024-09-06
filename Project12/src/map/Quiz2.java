package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz2 {

	public static void main(String[] args) {
		
		// String형 키, int형 value를 가지는 HashMap 객체를 생성하세요.
		// 다음과 같이 데이터 3개를 추가하세요. {"국어", 80},  {"수학", 90}, {"영어", 100}
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		
		
		// 국어를 50점, 수학을 60점, 영어를 70점으로 수정하세요.
		
		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);
		
		
		// 영어점수를 삭제하세요.
		map.remove("영어");
		
		
		// map의 요소를 하나씩 출력하세요.
		System.out.println("map의 요소: " + map);
		System.out.println();
		
		
		// map에 저장된 모든 요소를 한번에 출력하세요.
		Set<String> keyset = map.keySet();
		
		for (String key : keyset) { // 다음 key가 있으면
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key)); // 키로 회원 조회
		}
		
		
		// map의 크기를 출력하세요.
		System.out.println();
		System.out.println("map의 크기: " + map.size());
		
	}

}
