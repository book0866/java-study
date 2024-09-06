package arraylist;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		// 러버덕 학생 생성
		Student student1 = new Student("러버덕");
		
		// 러버덕이 수강하는 과목을 추가
		student1.subjectList.add(new Subject("국어", 100));
		student1.subjectList.add(new Subject("수학", 50));
		
		student1.showInfo();
		
		
		// 스탠리 학생 생성
		Student student2 = new Student("스탠리");
		
		// 스탠리가 수강하는 과목을 추가
		student2.subjectList.add(new Subject("국어", 70));
		student2.subjectList.add(new Subject("영어", 85));
		student2.subjectList.add(new Subject("과학", 70));
		student2.subjectList.add(new Subject("사회", 85));
		
		student2.showInfo();
		
	}

}

// 과목 클래스
class Subject {
	
	String name; // 과목명
	int score; // 점수
	
	
	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}

// 학생 클래스
class Student {
	
	String studentName; // 학생의 이름
	ArrayList<Subject> subjectList; // 수강 과목 리스트
	
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); // ★
	}
	
		// 학생의 총 점수를 출력하는 메소드
		public void showInfo() {
			int total = 0; // 총 점수
			
			for (Subject s : subjectList) {
				total = total + s.score;
			}
			
			System.out.println(studentName + " 학생의 총점은 " + total + "점입니다.");
			
		}
	
}


