package hiding.test2;

public class Test2 {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.name = "둘리";
		person.height = 170;
		// 몸무게는 private로 설정해서 클래스 외부에서 사용 불가
		
	}

}


class Person {
	
	public String name; // 이름
	int height; // 키
	private double weight; // 몸무게
	
	
	public void showInfo() {
		
		System.out.println("이름: " + name + "키 :" + height + "몸무게: " + weight);
		
	}
	
}










