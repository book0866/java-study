package reference;

public class Ex1 {

	public static void main(String[] args) {
		
		Subject math = new Subject("수학", 85);
		Subject korean = new Subject("국어", 100);
		
		Student student = new Student(1001, "둘리", math, korean);
		
	}

}


// 성적 클래스
class Subject {
	
	String subjectName; // 과목 이름
	int scorePoint; // 점수
	
	// 모든 멤버변수를 초기화하는 생성자
	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
}


// 학생 클래스
class Student {
	
	int studentID; // 학번
	String studentName; // 이름
	Subject math; // 수학 성적
	Subject korean; // 국어 성적
	
	
	// 모든 멤버변수를 초기화하는 생성자
	public Student(int studentID, String studentName, Subject math, Subject korean) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}
	
}


















