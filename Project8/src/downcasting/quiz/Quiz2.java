package downcasting.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 아래 그림은 사람와 학생, 회사원 클래스의 상속관계를 표현한 것입니다.
		// 상속관계와 테스트 코드를 참고하여 다음과 같이 테스트 결과를 출력하세요.
		// Person형으로 리스트를 생성하고 학생과 회사원을 1명씩 저장하세요.
		// 그리고 리스트에 저장된 학생과 회사원을 꺼내서 가지고 있는 모든 기능을 호출하세요.
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Student("러버덕"));
		list.add(new Employee("스탠리"));
		
		
		for (Person person : list) {
			
			person.eat();
			
			if (person instanceof Student) {
				Student student = (Student)person;
				student.study();
			} else if (person instanceof Employee) {
				Employee employee = (Employee)person;
				employee.work();
			}
			
		}
		
	}

}

class Person {
	
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	
}


class Student extends Person {

	public Student(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(name + "이 밥을 먹는다.");
	}
	
	public void study() {
		System.out.println(name + "이 공부를 한다.");
	}
	
}


class Employee extends Person {

	public Employee(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println(name + "가 밥을 먹는다.");
	}
	
	public void work() {
		System.out.println(name + "가 일을 한다.");
	}
	
}
















