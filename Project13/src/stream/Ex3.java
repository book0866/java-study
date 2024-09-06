package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {
		
		// 리스트 생성
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 4);
		
		// 리스트로부터 스트림 생성
		Stream<Integer> stream1 = list.stream();
		
		// distinct: 중복을 제거하는 연산자
		stream1.distinct().forEach(n -> System.out.print(n + " "));
		
		
		// filter: 조건을 만족하는 요소만 추출하는 연산자
		list.stream()
				.filter(n -> n % 2 == 0) // 2의 배수만 추출
				.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		// limit: 요소를 n개만 추출
		final int sum = 0;
		list.stream()
				.limit(3) // 요소를 3개 추출
				.forEach(n -> n = sum + n);
		
		
		// sorted: 요소를 순서대로 정렬하는 연산자
		// reverseOrder: 역으로 정렬
		list.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(n -> System.out.print(n + " "));
		
		// 기본형 스트림: sum, max, min 같은 함수 사용 불가
		Stream<Integer> stream2 = list.stream(); // list -> stream
		
		// 숫자 타입 스트림: sum, max, min 같은 함수 사용 가능
		IntStream intStream = stream2
								.mapToInt(n -> n.intValue());
		
		
		// map: 다른 값으로 변경하는 연산자
		List<String> strList = Arrays.asList("aaa", "bbb", "ccc");
		
		// 문자열 -> 대문자
		strList.stream()
					.map(s -> s.toUpperCase())
					.forEach(s -> System.out.print(s + " "));
		
		
		// 문자열 -> 문자열의 길이
		strList.stream()
		.map(s -> s.length())
		.forEach(s -> System.out.print(s + " "));
		
		
		// 도서 리스트
		List<Book> list2 = new ArrayList<>();
		list2.add(new Book("자바프로그래밍", 10000));
		list2.add(new Book("스프링프로젝트", 20000));
		
		// 도서의 제목만 꺼내서 출력하기
//		list2.stream()
//				.map(t -> t.title)
//				.forEach(s -> System.out.print(s + " "));
		
		// map 생략 가능: s.title로 변경
		list2.stream()
				.forEach(s -> System.out.print(s.title + " "));
		
		
	}

}


// 도서 클래스
class Book {
	
	String title;
	int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
}


//R apply(T t) {
//	return t.title;
//}













