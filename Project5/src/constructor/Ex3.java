package constructor;

public class Ex3 {

}


// 게시물을 정의하는 클래스
class Board {
	
	int no;
	String title;
	String content;
	String writer;
	
	public Board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public Board(int no) {
		super();
		this.no = no;
	}

	public Board(int no, String title) { // 클래스 안{}에 우클릭 -> 소스 -> 컨스트럭터 어쩌구 유징 필드
		super();
		this.no = no;
		this.title = title;
	}

	public Board() { // 매개변수가 하나도 없으면 디폴트 생성자(객체만 생성하고 값을 초기화하지 않음)
		super();
	}
	
}