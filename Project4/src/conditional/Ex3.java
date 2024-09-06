package conditional;

public class Ex3 {

	public static void main(String[] args) {
		
		int age = 30;
		
		if (age < 8) { // 나이가 8살 미만이면
			System.out.println("미취학 아동입니다.");
		} else if (age < 14) { // 나이가 14살 미만이면
			System.out.println("초등학생입니다.");
		} else if (age < 17) { // 나이가 17살 미만이면
			System.out.println("중학생입니다.");
		} else if (age < 20) { // 나이가 20살 미만이면
			System.out.println("고등학생입니다.");
		} else { // 모두 아니라면
			System.out.println("성인입니다.");
		}
		
	}

}
