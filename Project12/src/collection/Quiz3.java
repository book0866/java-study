package collection;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 책 번호와 제목을 멤버로 가지는 Book 클래스를 만드세요.
		// Book 타입의 리스트를 생성하세요.
		// 리스트에 책 3권을 추가하세요.
		// 리스트에 저장된 모든 책의 정보를 출력하세요.
		// 리스트의 모든 요소를 삭제하세요.
		ArrayList<Book> list = new ArrayList<Book>();
		
		Book book1 = new Book(101, "누구를 위하여 종은 울리나");
		Book book2 = new Book(102, "모비딕");
		Book book3 = new Book(103, "변신");
		
		list.add(book1);
		list.add(book2);
		list.add(book3);
		
		System.out.println(list);
		
		for (Book book : list) {
			System.out.println(book);
		}
		
		// 리스트 일괄 삭제
		list.clear();
		System.out.println("리스트: " + list);

	}

}


class Book {
	int bookNumber;
	String bookTitle;

	
	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "책 번호: " + bookNumber + ", 책 제목: " + bookTitle;
	}
	

}