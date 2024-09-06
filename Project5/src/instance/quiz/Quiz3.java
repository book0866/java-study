package instance.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		// (자바프로그래밍, 20000, 한빛컴퍼니. 300)
		// (스프링, 15000, 한빛컴퍼니, 500)
		// 모든 인스턴스의 정보와 메모리 주소를 출력하세요.
		
		Book book1 = new Book();
		
		book1.title = "자바프로그래밍";
		book1.price = 20000;
		book1.publisher = "한빛컴퍼니";
		book1.page = 300;
		
		book1.showBookInfo();
		System.out.println("객체의 주소: " + book1);
		System.out.println();
		
		
		Book book2 = new Book();
		
		book2.title = "스프링";
		book2.price = 15000;
		book2.publisher = "한빛컴퍼니";
		book2.page = 500;
		
		book2.showBookInfo();
		System.out.println("객체의 주소: " + book2);
		
	}

}


class Book {
	
	// 다음과 같이 도서 클래스(Book)를 정의하세요.
	// 속성: 제목, 가격, 출판사, 페이지 수
	// 그리고 Book 클래스를 사용하여 다음 정보를 가지는 두 개의 인스턴스를 생성하세요.
	
	String title;
	int price;
	String publisher;
	int page;
	
	public void showBookInfo() {
		System.out.println("제목: " + title);
		System.out.println("가격: " + price + "원");
		System.out.println("출판사: " + publisher);
		System.out.println("페이지 수: " + page + "p");
	}
	
}




