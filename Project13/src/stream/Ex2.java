package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		
		// 스트림의 특징 3가지
		
		// 1. 한 번 생성하고 사용한 스트림은 재사용할 수 없다.
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3);
		Stream<Integer> stream = list.stream(); // 리스트 -> 스트림
		
		// forEach: 반복적인 작업을 수행하는 연산자
		stream.forEach(t -> System.out.println(t)); // 요소를 하나씩 꺼내서 원하는 작업을 반복 수행
		
		// count: 요소의 길이를 변환하는 연산자
//		long count = stream.count();
		
		
		// 2. 스트림 연산은 원본 데이터를 변경하지 않는다.
		Stream<Integer> stream2 = list.stream(); // 스트림 재생성
		
		// sorted: 요소들을 정렬하는 연산자
		// collect: 스트림을 list로 변환하는 연산자
		List<Integer> sorteList = stream2.sorted().collect(Collectors.toList());
		
		System.out.println(list); // 원본 데이터
		System.out.println(sorteList);
		
		
		// 3. 중간 연산은 여러 번 할 수 있고, 최종 연산은 마지막에 한 번만 할 수 있다.
		Stream<Integer> stream3 = list.stream();
		
		// filter: 조건을 만족하는 요소만 추출하는 연산자
		// sorted: 순서대로 정렬하는 연산자
		// forEach: 특정 작업을 반복하는 연산자
		stream3.filter(t -> t >= 3).sorted().forEach(t -> System.out.println(t));
		
		
		// 중간 연산자는 계속해서 스트림을 반환. 이어서 작업을 계속할 수 있음
		Stream<Integer> stream4 = list.stream();
		Stream<Integer> stream5 = stream4.filter(t -> t >= 3);
		Stream<Integer> stream6 = stream5.sorted();
		
	}

}


// 값이 3과 같거나 크면 true
//boolean test(T t) {
//	
//	return t >= 3;
//	
//// 	아래의 식과 같음
////	if (t >= 3) {
////		return true;
////	} else {
////		return false;
////	}
//	
//}


// 추상 메소드 구현하기(반복하고 싶은 작업)
//void accept(T t) {
//	
//	System.out.println(t);
//	
//}
//
//(T t) -> {
//	
//	System.out.println(t);
//	
//};















