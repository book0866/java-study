package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {

		// 다음과 같이 리스트를 생성하세요.
		// String[] arr = {"aaa", "aaa", "b", "b", "ccccc"};
		String[] arr = { "aaa", "aaa", "b", "b", "ccccc" };

		// 1. 문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요.
		// 결과: 3
		Stream<String> stream1 = Arrays.stream(arr);
		long no1 = stream1.filter(s -> s.length() >= 3).count();

		System.out.println(no1);

		// 2. 모든 문자열의 길이를 더한 합을 구하세요.
		// 결과: 13
		Stream<String> stream2 = Arrays.stream(arr);
		int no2 = stream2.mapToInt(s -> s.length()).sum();

		System.out.println(no2);

		// 3. 가장 길이가 짧은 문자열의 길이를 구하세요.
		// 결과: 1
		Stream<String> stream3 = Arrays.stream(arr);
		stream3.map(s -> s.length()) // 문자열 -> 문자열의 길이
				.sorted().limit(1).forEach(s -> System.out.println(s));

		// 4. 중복을 제거한 리스트를 만드세요.
		// 결과: [aaa, b, ccccc]
		Stream<String> stream4 = Arrays.stream(arr);
		List<String> list = stream4.distinct().collect(Collectors.toList());

		System.out.println(list);

	}

}
