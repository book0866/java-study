package instance;

public class Ex2 {

	public static void main(String[] args) {
		
		Student student1 = new Student();  // 첫 번째 학생 생성
		
		student1.studentID = 1001;
		student1.studentName = "부뿌기";
		student1.grade = 2;
		student1.address = "인천";
		
		student1.showStudentInfo();
		System.out.println("객체의 주소는 " + student1 + "입니다.");
		
		Student student2 = new Student(); // 두 번째 학생 생성
		
		student2.studentID = 1002;
		student2.studentName = "기리리";
		student2.grade = 3;
		student2.address = "청주";
		
		student2.showStudentInfo();
		System.out.println("객체의 주소는 " + student2 + "입니다.");
		
	}

}
