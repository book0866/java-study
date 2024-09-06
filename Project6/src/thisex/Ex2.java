package thisex;

public class Ex2 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("러버덕");
		
		System.out.println(person);
		person.printThis();
		
	}

}


class Person {
	
	String name;
	
	public void setName(String name) {
		this.name = name; // 멤버변수 = 지역변수
	}
	
	public void printThis() {
		System.out.println(this); // this: 인스턴스(스스로)를 가리키는 키워드
	}
	
}



