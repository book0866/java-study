package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz4 {

	public static void main(String[] args) {

		// 패키지 여행을 떠나는 고객 정보를 저장하는 Customer 클래스를 만드세요.
		// 속성: 이름,나이,여행비용

		// 다음과 같이 여행 고객 리스트를 생성하세요.
		List<Customer> list = new ArrayList<>();

		list.add(new Customer("러버덕", 40, 100));
		list.add(new Customer("스탠리", 13, 50));
		list.add(new Customer("노을이", 25, 70));

		// 고객 리스트를 사용하여 다음과 같은 정보를 출력하세요.

		// - 고객의 명단
		Stream<Customer> customer1 = list.stream();
		System.out.println("고객의 명단: ");
		customer1.forEach(s -> System.out.println(s.name));

		System.out.println();
		// - 여행의 총 비용
		int customer2 = list.stream().mapToInt(s -> s.price).sum();

		System.out.println("여행의 총 비용: " + customer2 + "만원");

		System.out.println();
		System.out.println("20세 이상 고객: ");
		// - 20세 이상의 고객을 찾아서 이름을 출력(나이순 정렬)
		list.stream().filter(c -> c.age >= 20).sorted((c1, c2) -> {
			if (c1.age > c2.age) {
				return 1;
			} else {
				return -1;
			}
		}).forEach(c -> System.out.println(c.name + " " + c.age));

	}

}

class Customer {

	String name;
	int age;
	int price;

	public Customer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}

}
