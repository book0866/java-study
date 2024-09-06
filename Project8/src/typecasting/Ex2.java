package typecasting;

public class Ex2 {

	public static void main(String[] args) {
		
		VIPCustomer2 vipCustomer2 = new VIPCustomer2("러버덕");
		
	}

}


class Customer2 {
	
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률
	
	public Customer2(String customerName) {
		
		this.customerName = customerName; // 초기화 // this 키워드로 멤버변수, 매개변수 구분
		
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 1%
		
		System.out.println("Customer2() 생성자 호출");
		
	}
	
	public void calcPrice(int price) {
		
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + " 님이 " + price + "원을 결제했습니다.");
		
	}
	
	public void showInfo() {
		 System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "p입니다.");
	}
	
}


class VIPCustomer2 extends Customer2 {
	
	double saleRatio; // 할인률
	
	public VIPCustomer2(String customerName) {
		
		super(customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05; // 5%
		saleRatio = 0.1; // 10%
		
		System.out.println("VIPCustomer2() 생성자 호출");
		
	}
	
}






















