package polymorphism;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		// 회원 리스트 생성
		ArrayList<Customer> list = new ArrayList<Customer>(); // <> 안에는 하나밖에 못 담으므로 부모 타입을 담아야 함
		
		// 일반 회원과 VIP 회원(같은 type)
		Customer customer1 = new Customer("러버덕"); // 일반 회원 생성
		Customer customer2 = new Customer("스탠리");
		Customer customer3 = new Customer("갤럭시");
		
		Customer customer4 = new VIPCustomer("갤워치"); // VIP 회원 생성
		Customer customer5 = new VIPCustomer("로토무");
		
		
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		list.add(customer5);
		
		// 회원 등급에 따라 할인율과 보너스포인트 계산
		// 람다식 for문
		for (Customer customer : list) { // 변수 : 리스트
			customer.calcPrice(10000);
		}
		
		for (Customer customer : list) { // 변수 : 리스트
			customer.showInfo(); // 고객의 정보
		}
		
	}

}



















