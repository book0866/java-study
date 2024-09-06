package polymorphism.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 쇼핑몰에 회원이 늘어 GOLD 회원 등급을 하나 추가합니다.
		// - 제품을 살 때 10%를 할인해준다.
		// - 보너스 포인트를 2% 적립해준다.
		// 리스트를 생성하고 일반회원, 골드회원, VIP 회원을 1명씩 총 3명 저장하세요.
		// 모든 회원은 10000원짜리 제품을 구매합니다.
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		Customer customer1 = new Customer("러버덕");
		Customer customer2 = new GOLDCustomer("스탠리");
		Customer customer3 = new VIPCustomer("로토무");
		
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		
		
		for (Customer customer : list) {
			customer.calcPrice(10000);
			customer.showInfo();
			System.out.println();
		}
		
	}

}


class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + " 님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer extends Customer {

	double saleRatio;

	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + " 님이 " + salePrice + "원을 결제했습니다.");
	}
}

class GOLDCustomer extends Customer {

	double saleRatio;

	public GOLDCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + " 님이 " + salePrice + "원을 결제했습니다.");
	}
}

