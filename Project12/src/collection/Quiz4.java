package collection;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
		
		//  List을 활용하여 쇼핑몰의 회원을 관리하는 프로그램을 구현하세요.
		//  MemberArrayList 클래스는 회원을 저장하기 위한 ArrayList을 멤버변수로 가지고 있습니다.
		//  그리고 리스트에 회원을 추가하는 메소드, 리스트에서 회원을 삭제하는 메소드, 회원 리스트를 출력하는 메소드를 가지고 있습니다.
		//  MemberArrayList 클래스를 사용하여 아래와 같이 회원을 추가하고 삭제하세요.
		System.out.println("MemberArrayList를 생성하고 4명의 회원을 추가하세요!");
		
		MemberArrayList memberArrayList = new MemberArrayList();

		// 회원 4명 추가
		Member member1 = new Member(1001, "러버덕");
		Member member2 = new Member(1002, "스탠리");
		Member member3 = new Member(1003, "로토무");
		Member member4 = new Member(1004, "피카츄");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);

		memberArrayList.showMember();
		
		
		System.out.println("MemberArrayList에 1004번 회원이 있으면 삭제하세요!");
		
		// 아이디로 4번째 회원 삭제
		memberArrayList.removeMember(1004);
		memberArrayList.showMember();
		
	}

}


class MemberArrayList {
	
	ArrayList<Member> list; // 리스트 선언만 한 상태
	
	
	// 인스턴스 생성 + 초기화
	public MemberArrayList() {
		list = new ArrayList<Member>(); // 리스트를 먼저 생성해야 함(생성 + 초기화)
	}
	
	
	public void addMember(Member member) { // 입력받는 변수(Member member)를
		list.add(member); // 리스트에 추가
	}
	
	// 아이디로 특정 회원을 삭제하는 메소드
	public void removeMember(int memberID) {
		for (int i = 0; i < list.size(); i++) { // 반복문으로 요소 하나씩 꺼내서 확인하기
			Member member = list.get(i);
			int id = member.memberID;
			
			if (id == memberID) { // id 안의 아이디와 특정 아이디 비교하기
				list.remove(i);
				System.out.println(memberID + "번 회원이 삭제되었습니다.");
				return;
			}
		}
		
		System.out.println(memberID + "번 회원은 존재하지 않습니다.");
	}
	
	public void showMember() {
		
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
		
		System.out.println();
		
	}
	
}














