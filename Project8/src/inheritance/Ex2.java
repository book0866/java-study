package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.eat(); // 부모 클래스에서 물려받은 기능
		student.talk(); // 부모 클래스에서 물려받은 기능
		student.study();
		
		Propessor propessor = new Propessor();
		
		propessor.eat(); // 부모 클래스에서 물려받은 기능
		propessor.talk(); // 부모 클래스에서 물려받은 기능
		propessor.work();
		
	}

}

// 사람 클래스
class Person {
	
	public void talk() {
		System.out.println("대화를 한다.");
	}
	
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	
}


// 학생 클래스
class Student extends Person {
	
	public void study() {
		System.out.println("공부를 한다.");
	}
	
}


// 교수 클래스
class Propessor extends Person {
	
	public void work() {
		System.out.println("일을 한다.");
	}
	
}
















