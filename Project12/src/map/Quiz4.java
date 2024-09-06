package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 1. 다음과 같이 학생(Student) 클래스를 만드세요.
		// 속성: 학번, 이름, 국어점수, 수학점수, 영어점수
		
		// 2. 학생목록을 저장하는 map 객체를 생성하세요. (키:학번, 값:학생정보)
		HashMap<Integer, Student> stu = new HashMap<>();
		
		
		// 3. 다음과 같이 맵에 학생 3명을 추가하세요.
		// ( 학번: 1001, 이름: 둘리, 국어: 90, 수학: 80, 영어: 70 )
		// ( 학번: 1002, 이름: 도우너, 국어: 55, 수학: 65, 영어: 75 )
		// ( 학번: 1003, 이름: 또치, 국어: 80, 수학: 50, 영어: 50 )
		stu.put(1001, new Student(1001, "러버덕", 90, 80, 70));
		stu.put(1002, new Student(1002, "스탠리", 55, 65, 75));
		stu.put(1003, new Student(1003, "로토무", 80, 50, 50));
		
		
		// 4. 학생별 총점과 평균점수를 구하세요.
		// ex) 둘리의 총점: 240, 평균: 80.0
		Set<Integer> keySet = stu.keySet();
		
		for (Integer key : keySet) {
			
			Student student = stu.get(key);
			
			int total = student.korSco + student.mathSco + student.engSco;
			
			int average = total / 3;
			
			
			System.out.println(student.name + " 학생의 총점: " + total + " | 평균: " + average);

		}
		
		System.out.println();
		
		// 5. 과목별 총점과 평균점수를 구하세요.
		// ex) 국어의 총점: 225, 평균: 75.0
		int korsum = 0;
		int mathsum = 0;
		int engsum= 0;
		
		for (Integer key : keySet) {
			Student student = stu.get(key);
			korsum = korsum + student.korSco;
			mathsum = mathsum + student.mathSco;
			engsum = engsum + student.engSco;
			
			System.out.println("국어의 총점: " + korsum + ", 평균: " + (korsum / 3.0));
			System.out.println("수학의 총점: " + mathsum + ", 평균: " + (mathsum / 3.0));
			System.out.println("영어의 총점: " + engsum + ", 평균: " + (engsum / 3.0));
			
		}
		
	}

}


class Student {
	
	int studentID;
	String name;
	int korSco;
	int mathSco;
	int engSco;
	
	
	public Student(int studentID, String name, int korSco, int mathSco, int engSco) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.korSco = korSco;
		this.mathSco = mathSco;
		this.engSco = engSco;
	}


	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", korSco=" + korSco + ", mathSco=" + mathSco
				+ ", engSco=" + engSco + "]";
	}
	
}
















