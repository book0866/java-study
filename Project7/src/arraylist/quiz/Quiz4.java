package arraylist.quiz;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
		
		// Student형 리스트를 생성하고, 학생 3명을 추가하세요.
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(101, "러버덕"));
		list.add(new Student(102, "스탠리"));
		list.add(new Student(103, "담터"));
		
		// 반복문을 사용하여 리스트의 요소를 출력하세요.
		for(int i=0; i<list.size(); i++){
			Student student = list.get(i);
			student.showInfo();
		}
		
	}

}

//학생(Student)을 정의하는 클래스를 만드세요.
// 속성: 학번, 이름
class Student {
	
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showInfo(){
		System.out.println("학번: " + studentID + " | 이름: " + name);
	}
	
}




