package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz3 {

	public static void main(String[] args) {
		
		// String형 키, float형 value를 가지는 HashMap 객체를 생성하세요.
		// 다음과 같이 데이터 3개를 추가하세요. {"국어", 80},  {"수학", 90}, {"영어", 100}
		HashMap<String, Float> map = new HashMap<>();
		
		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		
		// map에 저장된 과목명만 출력하세요.
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("과목명: " + key);
		}
		
		System.out.println();
		
		// map에 저장된 점수만 출력하세요.
		Collection<Float> values = map.values();
		for (float value : values) {
			System.out.println("점수: " + value);
		}
		
	}

}













