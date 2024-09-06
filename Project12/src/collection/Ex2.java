package collection;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		
		// 회원 리스트 생성
		ArrayList<Member> list = new ArrayList<>();
		
		Member member1 = new Member(1001, "러버덕");
		Member member2 = new Member(1002, "스탠리");
		Member member3 = new Member(1003, "로토무");
		
		list.add(member1);
		list.add(member2);
		list.add(member3);
		list.add(member3); // 리스트의 특징: 순서○, 중복○
		
//		Member m = list.get(0);
//		System.out.println(m);
//		// ↑ 같은 결과 ↓
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
		list.remove(0); // 1번째 회원 삭제
		
		System.out.println("전체 회원 수: " + list.size());
		
		// 리스트 출력하기
		System.out.println(list);
		
		// for문을 이용해서 전체 회원 정보 출력하기
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i); // 리스트에서 회원을 꺼냄
			System.out.println(member); // = System.out.println(member.toString()); (.toString() 생략 가능)
		}
		
	}

}


// 쇼핑몰 회원
class Member {
	
	int memberID; // 회원 아이디
	String memberName; // 회원 이름
	
	
	public Member(int memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}


	@Override
	public String toString() {
		return "Member [memberID=" + memberID + ", memberName=" + memberName + "]";
	}
	
	
}










