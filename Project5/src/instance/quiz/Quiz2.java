package instance.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 그리고 Order 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
		// 주문 번호: 1111  주문 날짜: 2018년 3월 12일  주문자 이름: 둘리  배송지: 서울시 영등포구 여의도동 20번지
		
		Order order = new Order();
		
		order.orderNumber = 1111;
		order.orderDate = "2018년 3월 12일";
		order.customerName = "호돌이";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("↓↓↓주문 정보↓↓↓");

		order.showOrderInfo();
		
	}

}


class Order {
	
	// 다음과 같이 주문 클래스(Order)를 정의하세요.
	// 주문 번호, 주문 날짜, 주문자 이름, 배송지를 속성으로 갖습니다.
	// 모든 주문 정보를 출력하는 showOrderInfo 함수를 갖습니다.
	
	int orderNumber;
	String orderDate;
	String customerName;
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문 번호: " + orderNumber);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문자 이름: " + customerName);
		System.out.println("배송지: " + address);
	}

}





