package instance;

public class Ex1 {
	
	public static void main(String[] args) {
		
		// 객체 생성
		Student student = new Student();
		
		// 객체의 멤버변수를 사용하여 학번 수정
		student.studentID = 1001;
		student.studentName = "모기";
		student.grade = 2;
		student.address = "인천 미추홀구";
		
		System.out.println("학생의 모든 정보를 출력합니다.");
//		System.out.println("studentID = " + student.studentID);
//		System.out.println("studentName = " + student.studentName);
//		System.out.println("grade = " + student.grade);
//		System.out.println("address = " + student.address); // 너무 많고 지저분함
		
		student.showStudentInfo();
		
		System.out.println("객체의 주소: " + student);
		
	}

}
