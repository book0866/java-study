package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 다음과 같이 쇼핑몰의 거래내역을 저장하는 클래스를 만드세요.
		// 속성: 주문번호, 주문연도, 거래금액(만원단위)
		
		// 다음과 같이 거래내역 리스트를 생성하세요.
		List<Order> list = new ArrayList<Order>();
		
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));
		
		
		// 1) 모든 거래번호를 한줄에 나열하세요. 결과: 1001 1002 1003 1004 1005 1006 1007
		Stream<Order> stream1 = list.stream();
		stream1.forEach(s -> System.out.print(s.orderNum + ", "));
		
		
		System.out.println();
		// 2) 2022년도의 거래 총금액과 건수를 출력하세요.
		// 결과: 총금액:650, 거래건수:3
		int total1 = list.stream()
								.filter(s -> s.orderDate == 2022)
								.mapToInt(s -> s.price)
								.sum();
								
		System.out.println("2022 총 금액: " + total1 + "만원");
		
		
		long total2 = list.stream()
								.filter(s -> s.orderDate == 2022)
								.count();
		
		System.out.println("2022 거래 건수: " + total2 + "회");
		
		
		
		// 3) 2023년도의 거래 총금액과 건수를 출력하세요.
		// 결과: 총금액:2150, 거래건수:4
		int total3 = list.stream()
								.filter(s -> s.orderDate == 2023)
								.mapToInt(s -> s.price)
								.sum();
				
		System.out.println("2023 총 금액: " + total3 + "만원");


		long total4 = list.stream()
								.filter(s -> s.orderDate == 2023)
								.count();
		
		System.out.println("2022 거래 건수: " + total4 + "회");
		
	}

}


class Order {
	
	int orderNum;
	int orderDate;
	int price;
	
	
	public Order(int orderNum, int orderDate, int price) {
		super();
		this.orderNum = orderNum;
		this.orderDate = orderDate;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Order [orderNum=" + orderNum + ", orderDate=" + orderDate + ", price=" + price + "]";
	}
	
}







