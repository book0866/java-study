package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz5 {

	public static void main(String[] args) {

		// Map을 활용하여 쇼핑몰의 회원을 관리하는 프로그램을 구현하세요.
		// MemberHashMap 클래스는 회원을 저장하기 위한 HashMap을 멤버변수로 가지고 있습니다.
		// 그리고 맵에 회원을 추가하는 메소드, 맵에서 회원을 삭제하는 메소드, 회원 목록을 출력하는 메소드를 가지고 있습니다.
		// MemberHashMap 클래스를 사용하여 아래와 같이 회원을 추가하고 삭제하세요.
		System.out.println("MemberHashMap을 생성하고 4명의 회원을 추가하세요!");
		
		MemberHashMap memberHashMap= new MemberHashMap();
		
		Member member1 = new Member(1001, "러버덕");
		Member member2 = new Member(1002, "스탠리");
		Member member3 = new Member(1003, "로토무");
		Member member4 = new Member(1004, "피카츄"); 
		
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		
		memberHashMap.showMember();
		
		
		System.out.println("MemberHashMap에 1004번 회원이 있으면 삭제하세요!");
		
		memberHashMap.removeMember(1004);
		memberHashMap.showMember();

	}

}


class MemberHashMap {
	
	HashMap<Integer, Member> map; // map 선언
	
	
	// 생성자의 목적: 인스턴스 생성 + 초기화
	public MemberHashMap() {
		map = new HashMap<>(); // map 생성
	}
	
	
	public void addMember(Member member) {
		map.put(member.memberID, member); // 객체(member)에서 추출(.)
	}
	
	
	public void removeMember(int memberID) {
		
		if (map.containsKey(memberID)) {
			map.remove(memberID);
			System.out.println(memberID + "번 회원이 삭제되었습니다.");
			return;
		}
		
//		Set<Integer> keySet = map.keySet();
//		
//		for (Integer key : keySet) {
//			
//			Member member = map.get(key);
//			int id = member.memberID;
//			
//			if (id == memberID) {
//				map.remove(key);
//				System.out.println(memberID + "번 회원이 삭제되었습니다.");
//				return;
//			}
//			
//		}
		
		System.out.println(memberID + "번 회원은 존재하지 않습니다.");
		
		}
		

	public void showMember() {
		
		Collection<Member> values = map.values();
		
		for (Member member : values) {
			System.out.println(member);
		}
		
		System.out.println();
		
	}
	
}










