package polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("러버덕");
		customer1.calcPrice(10000);
		customer1.showInfo();
		System.out.println();
		
		Customer customer2 = new VIPCustomer("스탠리");
		customer2.calcPrice(10000);
		customer2.showInfo();
		
		// 다형성을 활용하면 부모 클래스 하나로 여러 개의 자식 클래스를 사용할 수 있음
		
	}

}


class Customer {
	
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률
	
	public Customer(String customerName) {
		
		this.customerName = customerName; // 초기화 // this 키워드로 멤버변수, 매개변수 구분
		
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 1%
		
		System.out.println("Customer() 생성자 호출");
		
	}
	
	public void calcPrice(int price) {
		
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + " 님이 " + price + "원을 결제했습니다.");
		
	}
	
	public void showInfo() {
		 System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "p입니다.");
	}
	
}


class VIPCustomer extends Customer {
	
	double saleRatio; // 할인률
	
	public VIPCustomer(String customerName) {
		
		super(customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05; // 5%
		saleRatio = 0.1; // 10%
		
		System.out.println("VIPCustomer() 생성자 호출");
		
	}

	@Override // Override: 재정의  // source -> Override
	public void calcPrice(int price) {

		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		
		System.out.println(customerName + " 님이 " + salePrice + "원을 결제했습니다.");
		
	}
	
}

















