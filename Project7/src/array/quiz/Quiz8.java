package array.quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
		// 3개 크기의 Student형 배열을 생성하고, 3명의 학생 정보를 지정하세요.
		// 그리고 배열에 저장된 모든 학생이 정보를 출력하세요.
		Student[] student = new Student[3];
		
		student[0] = new Student(101, "러버덕");
		student[1] = new Student(102, "스탠리");
		student[2] = new Student(103, "린도르");
		
		for (int i = 0; i < student.length; i++) {
			student[i].showInfo();
		}
		
	}

}

//학생(Student)을 정의하는 클래스를 만드세요.
// 속성: 학번, 이름
// 학번과 이름을 초기화하는 생성자
// 학생의 정보를 출력하는 메소드
class Student {
	
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}

	public void showInfo() {
		System.out.println("학번: " + studentID + " | 이름: " + name);
	}
	
}





